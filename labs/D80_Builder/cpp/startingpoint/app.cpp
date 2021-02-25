#include <iostream>
#include <vector>

#include "Floor.hpp"
#include "Roof.hpp"
#include "Foundation.hpp"
#include "Wall.hpp"
#include "House.hpp"



using namespace std;

int main(int argc, char **argv) {
	auto roof = Roof("Shingles");
	auto foundation = Foundation("Concrete");

	vector<Wall> walls;
	walls.push_back(Wall("Wood",true,true));
	walls.push_back(Wall("Wood",true,true));
	walls.push_back(Wall("Wood",true,true));
	walls.push_back(Wall("Glass",false,true));
	walls.push_back(Wall("Drywall",false,false));

	vector<Floor> floors;
	floors.push_back(Floor("Wood"));
	floors.push_back(Floor("Concrete"));


	auto house = House(foundation, floors, walls, roof);
	house.PrintSummary();


	return 0;
}
