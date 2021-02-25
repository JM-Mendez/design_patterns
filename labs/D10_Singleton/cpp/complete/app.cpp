#include <iostream>

#include "Logger.hpp"

using namespace std;



void Enfarculate()
{
	try {
		throw "auto i = 1/0";
	}
	catch (...)
	{
		//Better log this
		Logger::instance().error("Can't divide by zero.");
	}
}

void Deenfarculate()
{
	try {
		throw "auto i = 1/0";
	}
	catch (...)
	{
		//Better log this
		Logger::instance().error("Still can't divide by zero.");
	}
}


int main() {
	cout << "Starting Enfarculation" << endl;
	Enfarculate();

	cout << "Starting Deenfarculation" << endl;
	Deenfarculate();

	cout << endl;
	cout << "Done";
	return 0;
}
