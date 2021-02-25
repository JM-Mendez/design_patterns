#include "Order.hpp"

class BillingDepartment
{


public:
	static Order bill(Order o)
	{
		o.status=o.status->next(OrderStatuses::billed);
		return o;
	}
};
