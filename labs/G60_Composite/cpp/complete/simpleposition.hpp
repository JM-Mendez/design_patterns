#pragma once
#include <string>
#include <ctime>
#include "position.hpp"

using namespace std;

enum Direction { Long, Short };

string direction_to_string(Direction d)
{
  switch(d)
  {
  case Direction::Long: return "Long";
  case Direction::Short: return "Short";
  default: throw "Bad Enum";
  }
}

class SimplePosition : public Position
{
public:
	string symbol = "";
	int quantity = 0;
	Direction direction;

	SimplePosition(string symbol, int quantity, Direction direction)
	{
		this->symbol = symbol;
		this->quantity = quantity;
		this->direction = direction;
	}

	string getInfo()
	{
		string results = "";
		results += "[";
		results += this->symbol;
		results += " ";
		results += to_string(this->quantity);
		results += " ";
		results += direction_to_string(this->direction);
		results += "]";
		return results;
	}




};
