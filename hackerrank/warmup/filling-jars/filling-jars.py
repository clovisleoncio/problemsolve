#!/usr/bin/env python

numberOfJars, testCases = [int(x) for x in raw_input().split()];

total = 0;

for i in xrange(testCases):
    a, b, number = [int(x) for x in raw_input().split()];
    total = total + (b - a + 1) * number;

print total / numberOfJars
