#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
	n = raw_input();
	n_int = int(n);

	divisors = 0;

	for c in n:
		if c != '0' and n_int % int(c) == 0:
			divisors = divisors + 1;

	print divisors;