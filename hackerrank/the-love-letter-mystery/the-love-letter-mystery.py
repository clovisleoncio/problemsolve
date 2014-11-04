#!/usr/bin/env python

numberOfCases = int(raw_input());

for n in xrange(numberOfCases):
	word = raw_input();
	operations = 0
	for i in xrange(len(word) / 2):
		operations = operations + abs(ord(word[i]) - ord(word[-(i+1)]))
	print operations