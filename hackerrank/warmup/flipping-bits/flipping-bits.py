#!/usr/bin/env python

baseNumber = int('11111111111111111111111111111111', 2);

for x in xrange(int(raw_input())):
	number = int(raw_input());
	print number ^ baseNumber;