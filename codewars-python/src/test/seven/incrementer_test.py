import unittest

from src.seven.incrementer import incrementer


class TestIncrementer(unittest.TestCase):
    def test_empty_list(self):
        self.assertEqual(incrementer([]), [])

    def test_incrementer(self):

        self.assertEqual([2, 4, 6], incrementer([1, 2, 3]))
        self.assertEqual([5, 8, 0, 5, 8], incrementer([4, 6, 7, 1, 3]))
        self.assertEqual([4, 8, 2, 2, 4], incrementer([3, 6, 9, 8, 9]))
        self.assertEqual([2, 4, 6, 8, 0, 2, 4, 6, 8, 9, 0, 1, 2, 2],
                         incrementer([1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 8]))


if __name__ == '__main__':
    unittest.main()
