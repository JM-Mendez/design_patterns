#include <string>
#include <iostream>
#include <thread>
#include <chrono>

using namespace std;


class Logger
{
	static Logger* _instance;

	Logger()
	{
		std::this_thread::sleep_for(std::chrono::seconds(3));
	}

public:

    static Logger& instance()
    {
        static Logger    instance; // Instantiated on first use.
        return instance;
    }


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





};
