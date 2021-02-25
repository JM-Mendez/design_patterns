#include "Order.hpp"
#include "OrderStatus.hpp"

class Warehouse
{


public:
	static Order fill(Order o)
	{
		o.status=o.status->next(OrderStatuses::filled);
		return o;
	}
};
