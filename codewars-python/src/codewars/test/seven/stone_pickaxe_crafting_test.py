import unittest

from src.codewars.seven.stone_pickaxe_crafting import stone_pick


class StonePickTests(unittest.TestCase):

    def test_example_tests(self):
        self.assertEqual(stone_pick(["Sticks"] * 4 + ["Cobblestone"] * 6), 2)
        self.assertEqual(stone_pick(["Sticks"] * 2 + ["Cobblestone"] * 1), 0)
        self.assertEqual(stone_pick(["Sticks"] * 4 + ["Wool"] * 3 + ["Dirt"] * 6), 0)
        self.assertEqual(stone_pick(["Wood"] * 2 + ["Cobblestone"] * 12), 4)

    def test_more_equal_than(self):
        self.assertEqual(stone_pick(["Sticks"] * 4 + ["Cobblestone"] * 3), 1)
        self.assertEqual(stone_pick(["Sticks"] * 31 + ["Cobblestone"] * 25), 8)
        self.assertEqual(stone_pick(["Sticks"] * 64 + ["Cobblestone"] * 64), 21)

    def test_mixed_junk(self):
        self.assertEqual(stone_pick(
            ["Sticks", "Wool", "Dirt", "Diamond", "Stone", "Cobblestone", "Sticks", "Cobblestone", "Cobblestone"]), 1)
        self.assertEqual(stone_pick(["Wool", "Dirt", "Diamond", "Sticks", "Cobblestone", "Cobblestone"]), 0)
        self.assertEqual(
            stone_pick(["Wool"] * 21 + ["Sticks"] * 11 + ["Stone"] * 31 + ["Cobblestone"] * 41 + ["Diamond"] * 8), 5)

    def test_no_picks(self):
        self.assertEqual(stone_pick(["Wool", "Dirt", "Diamond", "Sticks"]), 0)
        self.assertEqual(stone_pick(["Wood", "Dirt", "Cobblestone", "Sticks"]), 0)
        self.assertEqual(
            stone_pick(["Dirt"] * 51 + ["Cobblestone"] * 21 + ["Sticks"] + ["Wool"] * 41 + ["Diamond"] * 12), 0)

    def test_wood_only(self):
        self.assertEqual(stone_pick(["Wood"] * 51 + ["Cobblestone"] * 91), 30)
        self.assertEqual(stone_pick(["Wood"] * 12 + ["Cobblestone"] * 120), 24)
        self.assertEqual(stone_pick(["Wood"] * 33 + ["Cobblestone"] * 50), 16)

    def test_none(self):
        self.assertEqual(stone_pick([]), 0)


if __name__ == '__main__':
    unittest.main()
