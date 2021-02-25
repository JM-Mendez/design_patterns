#include "Order.hpp"

class Warehouse
{


public:
	static Order fill(Order o)
	{
		o.status="Filled";
		return o;
	}
};
