#!/usr/bin/env python

import sys;

raw_input();

numbers = [int(x) for x in raw_input().split()];

numbers.sort();

minDifference = sys.maxint;
pairs = [];

for i in xrange(0, len(numbers) - 1):
	difference = abs(numbers[i + 1] - numbers[i]);
	if difference < minDifference:
		pairs = [numbers[i], numbers[i + 1]];
		minDifference = difference;
	elif difference == minDifference:
		pairs.append(numbers[i]);
		pairs.append(numbers[i + 1]);

print ' '.join(str(x) for x in pairs);