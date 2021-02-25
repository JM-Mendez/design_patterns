#pragma once
#include <memory>
#include "OrderStatus.hpp"

using namespace std;

class Order
{


public:
	int id;
	int quantity;
	string productNumber="";
	shared_ptr<OrderStatus> status = OrderStatuses::created;

};
