#include "Bill.hpp"

using namespace std;


class Resolution : public Bill
{
public:
	Resolution(string id):Bill(id){}
	virtual void signoff(){}
};
