import unittest

from src.codewars.seven.cat_years_dog_years import owned_cat_and_dog


class TestOwnedCatAndDog(unittest.TestCase):

    def test_basic_zero(self):
        self.assertEqual([0, 0], owned_cat_and_dog(9, 7))

    def test_basic_one(self):
        self.assertEqual([1, 1], owned_cat_and_dog(15, 15))
        self.assertEqual([1, 1], owned_cat_and_dog(18, 21))
        self.assertEqual([1, 1], owned_cat_and_dog(19, 17))

    def test_basic_two(self):
        self.assertEqual([2, 2], owned_cat_and_dog(24, 24))
        self.assertEqual([2, 2], owned_cat_and_dog(25, 25))
        self.assertEqual([2, 2], owned_cat_and_dog(26, 26))
        self.assertEqual([2, 2], owned_cat_and_dog(27, 27))

    def test_basic_ten(self):
        self.assertEqual([10, 10], owned_cat_and_dog(56, 64))


if __name__ == '__main__':
    unittest.main()
