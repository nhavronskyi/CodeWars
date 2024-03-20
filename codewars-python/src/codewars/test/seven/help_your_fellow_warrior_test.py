import unittest

from src.codewars.seven.help_your_fellow_warrior import get_honor_path


class TestGetHonorPath(unittest.TestCase):
    def test_basic_test_cases(self):
        self.assertEqual({"2kyus": 1, "1kyus": 4}, get_honor_path(2, 11))
        self.assertEqual({"2kyus": 0, "1kyus": 4}, get_honor_path(2, 10))
        self.assertEqual({"2kyus": 1, "1kyus": 0}, get_honor_path(2, 3))
        self.assertEqual({}, get_honor_path(11, 2))
        self.assertEqual({}, get_honor_path(11, 11))


if __name__ == '__main__':
    unittest.main()
