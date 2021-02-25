#pragma once

#include <string>
using namespace std;

class Wall
{

public:
	string material = "";
	bool isLoadBearing = false;
	bool isExternal = false;

	Wall(string material, bool isLoadBearing, bool isExternal)
	{
		this->material=material;
		this->isLoadBearing= isLoadBearing;
		this->isExternal= isExternal;
	}

};
