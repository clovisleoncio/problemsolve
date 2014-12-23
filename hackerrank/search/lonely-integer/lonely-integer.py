#!/usr/bin/env python

def getLonely(numbers):
	for x in xrange(101):
		if numbers[x] == False:
			return x;
	return -1;

raw_input();

numbers = [True for x in xrange(101)];

for number in [int(x) for x in raw_input().split()]:
	numbers[number] = not numbers[number];

print getLonely(numbers);