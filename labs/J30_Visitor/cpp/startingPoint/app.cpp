#include <iostream>
#include<memory>
#include<vector>
#include<string>
using namespace std;

class FileInfo;
class DirectoryInfo;


class FileSystemInfo
{
	string name = "";
  public:
	string getName(){return name;}
	void setName(string name){this->name=name;}
    FileSystemInfo(){}
    virtual ~FileSystemInfo(){}
    virtual void print(int nesting)=0;
};

string pad(string toPad, int nesting)
{
	toPad.insert(toPad.begin(),nesting*2,' ');
	return toPad;
}


class FileInfo : public FileSystemInfo
{
  public:
    FileInfo(string name)
    {
    	this->setName(name);
    }

    void print(int nesting) override
    {
    	cout << pad(this->getName(),nesting) << endl;
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

    DirectoryInfo(string name)
    {
    	this->setName(name);
    }

    void print()
    {
    	print(0);
    }


    void print(int nesting) override
    {
    	cout << pad(this->getName(),nesting) << endl;
        auto children = getContents();
        for(int i =0; i<children.size();i++)
        {
        	children[i]->print(nesting+1);
        }
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
	root.print();


	return 0;
}
