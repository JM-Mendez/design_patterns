#include "Bill.hpp"

using namespace std;


class Appropriation : public Bill
{
public:
	Appropriation(string id):Bill(id){}

	virtual void process_workflow()
	{
		report("Proposal");
		report("Committee Debate");
		report("Committee Vote");

		report("Some other committee Debate");
		report("Some other committee Vote");

		report("Floor Debate");
		report("Floor Vote");
		report("Executive Sign-off");
	}
};
