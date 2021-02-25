#pragma once
using namespace std;

class Bill
{

public:

	string id="";
	void report(string step)
	{
		cout << "[bill:" << id << " step:" << step << "]" << endl;
	}


	Bill(string id)
	{
		this->id=id;
	}

	virtual void process_workflow()
	{
		report("Proposal");
		report("Committee Debate");
		report("Committee Vote");
		report("Floor Debate");
		report("Floor Vote");
		report("Executive Sign-off");
	}
};
