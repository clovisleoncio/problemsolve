#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for x in xrange(numberOfTestCases):
	deletions = 0;
	previousChar = ' ';
	for c in raw_input():
		if c == previousChar:
			deletions = deletions + 1;
		else:
			previousChar = c;
	print deletions;