import unittest

from src.seven.vowel_count import get_count


class MyTestCase(unittest.TestCase):
    def test_counter(self):
        test = [
            [5, "aeiou"],
            [0, "y"],
            [0, "bcdfghjklmnpqrstvwxz y"],
            [0, ""],
            [5, "abracadabra"]
        ]
        for e in test:
            self.assertEqual(e[0], get_count(e[1]))


if __name__ == '__main__':
    unittest.main()
