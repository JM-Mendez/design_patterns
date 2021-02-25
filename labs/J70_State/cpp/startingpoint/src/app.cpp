#include <iostream>
#include "Order.hpp"
#include "Warehouse.hpp"
#include "ShippingDepartment.hpp"
#include "BillingDepartment.hpp"


using namespace std;

void reportStatus(Order o)
{
	cout << "The status is:" << o.status << endl;
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

	return 0;
}
