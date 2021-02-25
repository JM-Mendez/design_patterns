#pragma once
#include <vector>
#include <string>
#include "position.hpp"

using namespace std;

class CompositePosition : public Position
{
public:
	vector<Position*> positions;

	CompositePosition(vector<Position*> positions)
	{
		this->positions = positions;
	}

	string getInfo()
	{
		string results = "{composite ";
		results += "\n";

		for(auto p : this->positions)
		{
			results += "  ";
			results += p->getInfo();
			results += "\n";
		}
		results += "}";
		results += "\n";

		return results;
	}




};
