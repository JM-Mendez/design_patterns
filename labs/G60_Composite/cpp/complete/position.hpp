#pragma once
#include <string>
#include <ctime>

using namespace std;


class Position
{
public:
	time_t openedOn;
	time_t closedOn;

	Position()
	{
		this->openedOn = time(0);
	}

	virtual string getInfo() = 0;



};
