import unittest

from src.codewars.seven.misleading_signs import gaslighting


class TestGaslighting(unittest.TestCase):
    def do_test(self, args, expected):
        if expected:
            message = f"Your friend knows letters {list(args[2])} and CAN distinguish between `{args[0]}` and `{args[1]}`"
        else:
            message = f"Your friend knows letters {list(args[2])} and CANNOT distinguish between `{args[0]}` and `{args[1]}`"
        actual = gaslighting(*args)
        self.assertEqual(actual, expected, message)

    def test_example_tests(self):
        self.do_test(("snack", "snake", "c"), True)
        self.do_test(("snack", "snack", "snack"), False)
        self.do_test(("snake", "snack", "c"), True)
        self.do_test(("ping", "pong", "png"), False)
        self.do_test(("ping", "pong", "i"), True)


if __name__ == "__main__":
    unittest.main()
