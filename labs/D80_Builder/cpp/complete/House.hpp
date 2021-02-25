#pragma once

#include <iostream>
#include <vector>
#include "Floor.hpp"
#include "Roof.hpp"
#include "Foundation.hpp"
#include "Wall.hpp"



class House
{
public:
	Roof roof;
	Foundation foundation;
	vector<Wall> walls;
	vector<Floor> floors;

	House(Foundation foundation, vector<Floor> floors, vector<Wall> walls, Roof roof)
	{
		this->roof = roof;
		this->floors= floors;
		this->walls=walls;
		this->foundation= foundation;
	}

	void PrintSummary()
	{
		cout << "House Summary" << endl;
		cout << "Foundation: " << foundation.material << endl;

		cout << "Walls:" << endl;
		for(auto wall : walls){
			cout << "  " << wall.material << endl;
		}

		cout << "Floors:" << endl;
		for(auto floor : floors){
			cout << "  " << floor.material << endl;
		}

		cout << "Roof: " << roof.material << endl;


	}


};
