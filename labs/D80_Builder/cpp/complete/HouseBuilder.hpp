#pragma once

#include <iostream>
#include <vector>
#include "Floor.hpp"
#include "House.hpp"
#include "Roof.hpp"
#include "Foundation.hpp"
#include "Wall.hpp"


class HouseBuilder
{
public:
	Roof* roof = NULL;
	Foundation* foundation = NULL;
	vector<Wall> walls;
	vector<Floor> floors;

HouseBuilder(){}

bool isBuildable()
{
	if(!roof){
		return false;
	}

	if(!foundation){
		return false;
	}

	return walls.size()>3 && floors.size()>0;
}

House toHouse()
{
	return House( *foundation,floors, walls, *roof);
}

HouseBuilder withInteriorWalls(int quantity)
{
	for(int i =0; i< quantity;i++)
	{
		walls.push_back(Wall("Drywall",false,false));
	}

	return *this;
}

HouseBuilder withExteriorWalls(int quantity)
{
	return withExteriorWalls(quantity, "Wood");
}

HouseBuilder withExteriorWalls(int quantity, string material)
{
	for(int i =0; i< quantity;i++)
	{
		walls.push_back(Wall(material,true,true));
	}

	return *this;
}

HouseBuilder withWoodFloor()
{
	floors.push_back(Floor("Wood"));
	return *this;
}

HouseBuilder withConcreteFoundation()
{
	foundation = new Foundation("CCConcrete");
	return *this;
}

HouseBuilder withRegularRoof()
{
	roof = new Roof("Shingles");
	return *this;
}




};
