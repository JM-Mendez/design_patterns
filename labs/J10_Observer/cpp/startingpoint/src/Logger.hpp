#include <iostream>
using namespace std;


class Logger
{
public:
	void info(string message)
	{
		cout << "<<log:info " <<  message << ">>" << endl;
	}

	void warn(string message)
	{
		cout << "<<log:warn " <<  message << ">>" << endl;
	}

	void error(string message)
	{
		cout << "<<log:error " <<  message << ">>" << endl;
	}

};
