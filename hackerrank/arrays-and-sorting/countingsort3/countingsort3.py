#!/usr/bin/env python

inputSize = int(raw_input());

numbers = [0 for x in xrange(100)];

for x in xrange(inputSize):
	number = int(raw_input().split()[0]);
	numbers[number] = numbers[number]+1

total = 0

for x in numbers:
	total = total + x;
	print total, 