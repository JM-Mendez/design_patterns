
#include <iostream>
#include "Bill.hpp"
#include "Resolution.hpp"
#include "Appropriation.hpp"

using namespace std;

int main() {
	cout << "Here's a vanilla bill:" << endl;
	Bill("123").process_workflow();

	cout << endl << "Here's a resolution:" << endl;
	Resolution("456").process_workflow();


	cout << endl << "Here's an appropriation:" << endl;
	Appropriation("789").process_workflow();
	return 0;
}
