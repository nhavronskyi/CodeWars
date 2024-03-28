import unittest
import src.codewars.seven.decimal_time_conversion as task


class TestToIndustrial(unittest.TestCase):
    def test_1(self):
        self.assertEqual(task.to_industrial(1), 0.02)

    def test_2(self):
        self.assertEqual(task.to_industrial(2), 0.03)

    def test_3(self):
        self.assertEqual(task.to_industrial(3), 0.05)

    def test_4(self):
        self.assertEqual(task.to_industrial(4), 0.07)

    def test_0_05(self):
        self.assertEqual(task.to_industrial("0:05"), 0.08)

    def test_0_06(self):
        self.assertEqual(task.to_industrial("0:06"), 0.1)

    def test_0_07(self):
        self.assertEqual(task.to_industrial("0:07"), 0.12)

    def test_5_35(self):
        self.assertEqual(task.to_industrial("5:35"), 5.58)

    def test_135(self):
        self.assertEqual(task.to_industrial(135), 2.25)


class TestToNormal(unittest.TestCase):
    def test_1_75(self):
        self.assertEqual(task.to_normal(1.75), "1:45")

    def test_0_33(self):
        self.assertEqual(task.to_normal(0.33), "0:20")

    def test_124_60(self):
        self.assertEqual(task.to_normal(124.60), "124:36")

    def test_69_99373876(self):
        self.assertEqual(task.to_normal(69.99373876), "70:00")


if __name__ == '__main__':
    unittest.main()
