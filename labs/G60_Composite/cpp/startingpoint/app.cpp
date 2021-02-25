
#include <iostream>
#include "position.hpp"
using namespace std;





int main() {

	Position positions[] = {
			Position("EUR", 12, Direction::Long),
			Position("YEN", 98, Direction::Short),
	};

	cout << "Here are my positions:" << endl;

	for(auto p: positions)
	{
		cout << p.getInfo() << endl;
	}


	return 0;
}
