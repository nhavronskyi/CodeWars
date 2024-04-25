from unittest import TestCase

import src.seven.find_the_middle_element as task


class MyTestCase(TestCase):
    def test_something(self):
        self.assertEqual(task.gimme([2, 3, 1]), 0, 'Finds the index of middle element')
        self.assertEqual(task.gimme([5, 10, 14]), 1, 'Finds the index of middle element')
