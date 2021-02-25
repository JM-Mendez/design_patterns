
#include <iostream>
#include <memory>
#include "simpleposition.hpp"
#include "compositeposition.hpp"
#include "position.hpp"
#include <vector>
using namespace std;





int main() {

	vector<Position*> positions{
		new SimplePosition("EUR", 12, Direction::Long),
		new SimplePosition("YEN", 988, Direction::Short),
		new CompositePosition({
			new SimplePosition("SFR", 32, Direction::Long),
			new SimplePosition("USD", 8, Direction::Short),
		}),
	};

	cout << "Here are my positions:" << endl;

	for(auto p: positions)
	{
		cout << p->getInfo() << endl;
	}


	return 0;
}
