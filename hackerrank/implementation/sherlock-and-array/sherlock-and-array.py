#!/usr/bin/env python

def elementExists(numbers):
	left = -numbers[-1];
	right = sum(numbers);
	for i in xrange(len(numbers)):
		left = left + numbers[i - 1];
		right = right - numbers[i];
		if(left == right):
			return 'YES';
		elif(left > right):
			return 'NO';

for t in xrange(int(raw_input())):
	raw_input();
	numbers = [int(x) for x in raw_input().split()];
	print elementExists(numbers);