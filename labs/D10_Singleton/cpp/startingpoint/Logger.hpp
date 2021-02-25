#include <string>
#include <iostream>
#include <thread>
#include <chrono>

using namespace std;


class Logger
{
public:

	void info(string message)
	{
		cout << "[info: " << message << "]" << endl;
	}

	void warn(string message)
	{
		cout << "[warn: " << message << "]" << endl;
	}

	void error(string message)
	{
		cout << "[error: " << message << "]" << endl;
	}


	Logger()
	{
		std::this_thread::sleep_for(std::chrono::seconds(3));
	}


};
