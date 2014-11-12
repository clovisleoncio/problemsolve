#!/usr/bin/env python

from math import sqrt;

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    n = long(raw_input());

    if sqrt(5 * (n**2) + 4) % 1 == 0 or sqrt(5 * (n**2) - 4) % 1 == 0:
        print 'IsFibo';
    else:
        print 'IsNotFibo';
