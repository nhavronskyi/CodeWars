import unittest

from src.codewars.seven.product_of_maximums_of_array import max_product


class TestMaxProduct(unittest.TestCase):
    def test_sample_tests(self):
        self.assertEqual(max_product([0] * 10, 5), 0)
        self.assertEqual(max_product([4, 3, 5], 2), 20)
        self.assertEqual(max_product([10, 8, 7, 9], 3), 720)
        self.assertEqual(max_product([8, 6, 4, 6], 3), 288)

    def test_larger_arrays(self):
        self.assertEqual(max_product(list(range(10, -1, -1)), 5), 10 * 9 * 8 * 7 * 6)
        self.assertEqual(max_product([10, 2, 3, 8, 1, 10, 4], 5), 9600)
        self.assertEqual(max_product([13, 12, -27, -302, 25, 37, 133, 155, -1], 5), 247895375)

    def test_negative_array(self):
        self.assertEqual(max_product([-4, -27, -15, -6, -1], 2), 4)
        self.assertEqual(max_product([-17, -8, -102, -309], 2), 136)

    def test_positive_negative_array(self):
        self.assertEqual(max_product([10, 3, -27, -1], 3), -30)
        self.assertEqual(max_product([14, 29, -28, 39, -16, -48], 4), -253344)


if __name__ == '__main__':
    unittest.main()
