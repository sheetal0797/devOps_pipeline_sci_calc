#!/usr/bin/python3
#test case for adding two numbers
import unittest
from prog1 import summation
class TestSum(unittest.TestCase):
	def test_list_int(self):
		"""
		test case to add two numbers
		"""
		print("test-webhook also")
		data=[23,32]
		result=summation(data)
		self.assertEqual(result,55)
if __name__=='__main__':
	unittest.main()
