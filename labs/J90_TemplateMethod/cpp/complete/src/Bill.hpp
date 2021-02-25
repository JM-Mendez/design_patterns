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
		preProposal();
		proposal();
		postProposal();

		preCommittee();
		committee();
		postCommittee();

		preFloor();
		floor();
		postFloor();

		preSignoff();
		signoff();
		postSignoff();
	}

	virtual void preProposal(){}
	virtual void proposal()
	{
		report("Proposal");
	}
	virtual void postProposal(){}

	virtual void preCommittee(){}
	virtual void committee()
	{
		report("Committee Debate");
		report("Committee Vote");
	}
	virtual void postCommittee(){}

	virtual void preFloor(){}
	virtual void floor()
	{
		report("Floor Debate");
		report("Floor Vote");
	}
	virtual void postFloor(){}

	virtual void preSignoff(){}
	virtual void signoff()
	{
		report("Executive Sign-off");
	}
	virtual void postSignoff(){}



};
