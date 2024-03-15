from unittest import TestCase

from src.codewars.seven.digits_explosion import digits_explosion

sample_test_cases = [
    # (input, expected),
    ('312', '333122'),
    ('102269', '12222666666999999999'),
    ('0', ''),
    ('000', ''),
    ('123', '122333'),
]


class Test(TestCase):
    def test_sample_tests(self):
        for s, expected in sample_test_cases:
            self.assertEqual(expected, digits_explosion(s))
