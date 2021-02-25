#include <iostream>
#include "Order.hpp"
#include "Warehouse.hpp"
#include "ShippingDepartment.hpp"
#include "BillingDepartment.hpp"


using namespace std;

void reportStatus(Order o)
{
	cout << "The status is:" << o.status->toString() << endl;
}

int main() {
	auto o = Order();
	o.id=1;

	reportStatus(o);

	o = Warehouse::fill(o);
	reportStatus(o);

	o = ShippingDepartment::ship(o);
	reportStatus(o);

	o = BillingDepartment::bill(o);
	reportStatus(o);

	try
	{
		o = ShippingDepartment::ship(o);
	}
	catch(...)
	{
		cout << "Can't ship twice. That's good." << endl;
	}

	return 0;
}
