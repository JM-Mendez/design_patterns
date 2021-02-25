from unittest import TestCase
from app import toText

class TestToText(TestCase):
    def test_threes_should_fizz(self):
        expected = "fizz"
        assert toText(3) == expected
        assert toText(99) == expected
        assert toText(33) == expected

    def test_fives_should_buzz(self):
        expected = "buzz"
        assert toText(5) == expected
        assert toText(25) == expected

    def test_both_should_fizzbuzz(self):
        expected = "fizzbuzz"
        assert toText(15) == expected
        assert toText(90) == expected

    def test_primes_should_do_numbers(self):
        assert toText(17) == str(17)
