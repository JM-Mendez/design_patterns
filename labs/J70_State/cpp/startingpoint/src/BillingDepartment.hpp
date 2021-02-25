#include "Order.hpp"

class BillingDepartment
{


public:
	static Order bill(Order o)
	{
		o.status="Billed";
		return o;
	}
};
