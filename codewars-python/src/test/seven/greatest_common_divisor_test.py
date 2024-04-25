import unittest

from src.seven.greatest_common_divisor import my_gcd


class TestMyGCD(unittest.TestCase):
    def test_example_1(self):
        self.assertEqual(my_gcd(30, 12), 6)

    def test_example_2(self):
        self.assertEqual(my_gcd(36, 12), 12)

    def test_example_3(self):
        self.assertEqual(my_gcd(8, 9), 1)

    def test_example_4(self):
        self.assertEqual(my_gcd(1, 1), 1)


if __name__ == '__main__':
    unittest.main()
