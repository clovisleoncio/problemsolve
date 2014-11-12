#!/usr/bin/env python

numberOfTestCases = int(raw_input());

def findDecentNumber(n):
	for x in xrange(n+1):
		if (n - x) % 3 == 0 and (x % 5) == 0:
			return ''.join('5' for k in xrange(n-x)) + ''.join('3' for k in xrange(x));
	return '-1'

for i in xrange(numberOfTestCases):
	print findDecentNumber(int(raw_input()));