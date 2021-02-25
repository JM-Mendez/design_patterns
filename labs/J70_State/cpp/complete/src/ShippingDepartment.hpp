#include "Order.hpp"

class ShippingDepartment
{


public:
	static Order ship(Order o)
	{
		o.status=o.status->next(OrderStatuses::shipped);
		return o;
	}
};
