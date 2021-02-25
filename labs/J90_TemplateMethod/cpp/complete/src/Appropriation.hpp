#include "Bill.hpp"

using namespace std;


class Appropriation : public Bill
{
public:
	Appropriation(string id):Bill(id){}

	virtual void postCommittee()
	{
		report("Some other committee Debate");
		report("Some other committee Vote");
	}
};
