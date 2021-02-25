#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include "FizzBuzz.h"

TEST_CASE( "should_do_17_right", "[ToMessage]" ) {
	const auto actual = FizzBuzz::toMessage(17);
	const auto expected = "17";
	REQUIRE(actual == expected);
}

