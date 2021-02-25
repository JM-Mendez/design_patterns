#include <iostream>
#include <vector>

#include "Floor.hpp"
#include "Roof.hpp"
#include "Foundation.hpp"
#include "Wall.hpp"
#include "House.hpp"
#include "HouseBuilder.hpp"



using namespace std;

int main(int argc, char **argv) {

	auto builder = HouseBuilder()
					.withConcreteFoundation()
					.withRegularRoof()
					.withWoodFloor();


	if(builder.isBuildable()){
		cout << "Something's Fishy! The house shouldn't be buildable without walls." << endl;
	}

	builder.withExteriorWalls(4);
	builder.withInteriorWalls(3);

	if(!builder.isBuildable()){
		cout << "Something's Fishy! Now the house should build." << endl;
	}

	auto house = builder.toHouse();
	house.PrintSummary();


	return 0;
}
