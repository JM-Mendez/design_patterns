#include "Bill.hpp"

using namespace std;


class Resolution : public Bill
{
public:
	Resolution(string id):Bill(id){}
	virtual void process_workflow()
	{
		report("Proposal");
		report("Committee Debate");
		report("Committee Vote");
		report("Floor Debate");
		report("Floor Vote");
	}
};
