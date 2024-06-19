import unittest

from src.seven.disemvowel_trolls import disemvowel


class MyTestCase(unittest.TestCase):
    def test_something(self):
        args = [
            ["Ths wbst s fr lsrs LL!", "This website is for losers LOL!"],
            ["N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
             "No offense but,\nYour writing is among the worst I've ever read"],
            ["Wht r y,  cmmnst?", "What are you, a communist?"],
        ]
        for i in range(len(args)):
            arg = args[i]
            self.assertEqual(arg[0], disemvowel(arg[1]))


if __name__ == '__main__':
    unittest.main()
