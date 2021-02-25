#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include "FizzBuzz.h"

TEST_CASE( "should_do_fizz_right", "[ToMessage]" ) {
	const auto actual = FizzBuzz::toMessage(3);
	const auto expected = "fizz";
	REQUIRE(actual == expected);
}

TEST_CASE( "should_do_buzz_right", "[ToMessage]" ) {
	const auto actual = FizzBuzz::toMessage(5);
	const auto expected = "buzz";
	REQUIRE(actual == expected);
}

TEST_CASE( "should_do_fizzbuzz_right", "[ToMessage]" ) {
	const auto actual = FizzBuzz::toMessage(15);
	const auto expected = "fizzbuzz";
	REQUIRE(actual == expected);
}

TEST_CASE( "should_do_17_right", "[ToMessage]" ) {
	const auto actual = FizzBuzz::toMessage(17);
	const auto expected = "17";
	REQUIRE(actual == expected);
}

