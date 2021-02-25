#include <vector>
#include <functional>

using namespace std;

class Event
{
	vector<function<void(string)>> subscribers;
public:

	void subscribe(function<void(string)> subscriber){
		subscribers.push_back(subscriber);
	}

	void notify(string message)
	{
		for (auto subscriber: subscribers)
		{
			subscriber(message);
		}
	}

};
