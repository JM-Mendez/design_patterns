#include <iostream>
using namespace std;

class ProgressReporter
{

public:
	void update(string message)
	{
		cout << "[[Progress update: "<<  message << "]]"<< endl;
	}

};
