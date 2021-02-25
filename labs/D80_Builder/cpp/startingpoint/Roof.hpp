#pragma once


#include <string>
using namespace std;

class Roof
{

public:
	string material = "";

	Roof(string material)
	{
		this->material=material;
	}

	Roof(){}

};
