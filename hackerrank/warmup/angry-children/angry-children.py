#!/usr/bin/env python

import sys;

n = int(raw_input());
k = int(raw_input()) - 1;

numbers = [int(raw_input()) for x in xrange(n)];

numbers.sort();

minimumUnfairness = sys.maxint

for x in xrange(n - k):
	unfairness = numbers[x + k] - numbers[x];
	if unfairness < minimumUnfairness:
		minimumUnfairness = unfairness;

print minimumUnfairness;