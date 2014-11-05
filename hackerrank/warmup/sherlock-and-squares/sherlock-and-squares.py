#!/usr/bin/env python

from math import sqrt

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    a, b = [int(x) for x in raw_input().split()];

    a = int(sqrt(a));
    b = int(sqrt(b));

    print b - a
