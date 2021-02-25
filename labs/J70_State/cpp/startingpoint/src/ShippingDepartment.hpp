#include "Order.hpp"

class ShippingDepartment
{


public:
	static Order ship(Order o)
	{
		o.status="Shipped";
		return o;
	}
};
