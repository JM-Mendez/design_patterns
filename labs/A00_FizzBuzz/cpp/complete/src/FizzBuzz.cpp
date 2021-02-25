#include <iostream>
#include "FizzBuzz.h"

using namespace std;

FizzBuzz::FizzBuzz() {
	// TODO Auto-generated constructor stub

}

FizzBuzz::~FizzBuzz() {
	// TODO Auto-generated destructor stub
}

string FizzBuzz::toMessage(int i){
	auto dividesByFive = i % 5 == 0;
	auto dividesByThree = i % 3 == 0;
	if (dividesByFive && dividesByThree) {
		return "fizzbuzz";
	}
	if (dividesByThree) {
		return "fizz";
	}
	if (dividesByFive) {
		return "buzz";
	}
	return std::to_string(i);
}
