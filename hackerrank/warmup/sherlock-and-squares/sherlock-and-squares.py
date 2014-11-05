#!/usr/bin/env python

from math import sqrt

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    input = raw_input().split();
    a = int(input[0]);
    b = int(input[1]);

    a = int(sqrt(a));
    b = int(sqrt(b));

    print b - a
