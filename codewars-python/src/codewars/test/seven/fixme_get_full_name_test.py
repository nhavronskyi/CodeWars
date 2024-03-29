import unittest

from src.codewars.seven.fixme_get_full_name import Dinglemouse


class TestDinglemouse(unittest.TestCase):

    def test_sample_test_cases(self):
        self.assertEqual(Dinglemouse('Clint', 'Eastwood').get_full_name(), 'Clint Eastwood')
        self.assertEqual(Dinglemouse('', 'Eastwood').get_full_name(), 'Eastwood')
        self.assertEqual(Dinglemouse('Clint', '').get_full_name(), 'Clint')
        self.assertEqual(Dinglemouse('', '').get_full_name(), '')


if __name__ == '__main__':
    unittest.main()
