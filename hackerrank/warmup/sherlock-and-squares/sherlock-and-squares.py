#!/usr/bin/env python

from math import sqrt

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    a, b = [int(x) for x in raw_input().split()];

    sqrA = sqrt(a);
    sqrB = sqrt(b);

    a = int(sqrA);
    if sqrA % 1 > 0:
    	a = a + 1;
    b = int(sqrB);

    print b - a + 1
