#include <iostream>
#include<memory>
#include<vector>
#include<string>
using namespace std;





class FileInfo;
class DirectoryInfo;

class FileSystemVisitor
{
  public:
    virtual void visit(FileInfo& el) = 0;
    virtual void visit(DirectoryInfo& el) = 0;
};




class FileSystemInfo
{
	string name = "";
  public:
	string getName(){return name;}
	void setName(string name){this->name=name;}
    virtual void accept(FileSystemVisitor& v) = 0;
    FileSystemInfo(){}
    virtual ~FileSystemInfo(){}
};

class FileInfo : public FileSystemInfo
{
  public:
    virtual void accept(FileSystemVisitor& v) override
    {
      v.visit(*this);
    }
    FileInfo(string name)
    {
    	this->setName(name);
    }
};

class DirectoryInfo : public FileSystemInfo
{
	vector<shared_ptr<FileSystemInfo>> contents;
  public:

	vector<shared_ptr<FileSystemInfo>> getContents()
	{
		return contents;
	}

	void addChild(shared_ptr<FileSystemInfo> child)
	{
		contents.push_back(child);
	}

    virtual void accept(FileSystemVisitor& v) override
    {
      v.visit(*this);
    }

    DirectoryInfo(string name)
    {
    	this->setName(name);
    }

};


class DirectoryPrinter : public FileSystemVisitor
{
private:
	int nesting = 0;
	string pad(string toPad)
	{
		toPad.insert(toPad.begin(),nesting*2,' ');
		return toPad;
	}


public:
    virtual void visit(FileInfo& el) override
    {
    	cout << pad(el.getName()) << endl;
    };
    virtual void visit(DirectoryInfo& el) override
    {
        cout << pad(el.getName()) << endl;
    	this->nesting++;

        auto children = el.getContents();
        for(int i =0; i<children.size();i++)
        {
        	children[i]->accept(*this);
        }
        this->nesting--;
    };
    virtual void print(DirectoryInfo& root)
    {
    	visit(root);
    }
};

DirectoryInfo getFileSystemRoot() {
	auto net = make_shared<DirectoryInfo>("net");
	net->addChild(make_shared<FileInfo>("tun"));

	auto dev = make_shared<DirectoryInfo>("dev");
	dev->addChild(make_shared<FileInfo>("full"));
	dev->addChild(make_shared<FileInfo>("fuse"));
	dev->addChild(net);

	auto opt = make_shared<DirectoryInfo>("opt");
	opt->addChild(make_shared<FileInfo>("explosives.txt"));
	opt->addChild(make_shared<FileInfo>("secrets.txt"));

	auto root = DirectoryInfo("$");
	root.addChild(make_shared<FileInfo>("settings.ini"));
	root.addChild(make_shared<FileInfo>("thing.ini"));

	root.addChild(dev);
	root.addChild(opt);

	return root;
}

int main(int argc, char **argv) {

	auto root = getFileSystemRoot();
	auto visitor = DirectoryPrinter();
	visitor.visit(root);


	return 0;
}
