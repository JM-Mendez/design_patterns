#pragma once

#include <memory>

using namespace std;


class OrderStatus
{
public:
	virtual shared_ptr<OrderStatus> next(shared_ptr<OrderStatus> newStatus) = 0;
	virtual string toString() =0;
};

namespace OrderStatuses {
  extern shared_ptr<OrderStatus> created;
  extern shared_ptr<OrderStatus> filled;
  extern shared_ptr<OrderStatus> shipped;
  extern shared_ptr<OrderStatus> billed;
}

class CreatedStatus : public OrderStatus
{
public:
	string toString(){return "Created";}

	shared_ptr<OrderStatus> next(shared_ptr<OrderStatus> newStatus)
	{
		if(newStatus != OrderStatuses::filled)
		{
			throw "Bogus state transition!";
		}
		return newStatus;
	}

};

class FilledStatus :public OrderStatus
{
public:
	string toString(){return "Filled";}

	shared_ptr<OrderStatus> next(shared_ptr<OrderStatus> newStatus)
	{
		if(newStatus != OrderStatuses::shipped)
		{
			throw "Bogus state transition!";
		}
		return newStatus;
	}

};

class ShippedStatus : public OrderStatus
{
public:
	string toString(){return "Shipped";}

	shared_ptr<OrderStatus> next(shared_ptr<OrderStatus> newStatus)
	{
		if(newStatus != OrderStatuses::billed)
		{
			throw "Bogus state transition!";
		}
		return newStatus;
	}

};

class BilledStatus : public OrderStatus
{
public:
	string toString(){return "Billed";}

	shared_ptr<OrderStatus> next(shared_ptr<OrderStatus> newStatus)
	{
		throw "Bogus state transition!";
	}

};


shared_ptr<OrderStatus> OrderStatuses::created = make_shared<CreatedStatus>();
shared_ptr<OrderStatus> OrderStatuses::filled = make_shared<FilledStatus>();
shared_ptr<OrderStatus> OrderStatuses::shipped = make_shared<ShippedStatus>();
shared_ptr<OrderStatus> OrderStatuses::billed = make_shared<BilledStatus>();

