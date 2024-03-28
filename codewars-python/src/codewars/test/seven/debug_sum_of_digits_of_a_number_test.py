import unittest

from src.codewars.seven.debug_sum_of_digits_of_a_number import get_sum_of_digits


class TestGetSumOfDigits(unittest.TestCase):
    def test_basic_test(self):
        self.assertEqual(6, get_sum_of_digits(123))


if __name__ == '__main__':
    unittest.main()
