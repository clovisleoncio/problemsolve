#!/usr/bin/env python

line = raw_input().split();

numberOfJars = int(line[0]);
testCases = int(line[1]);

total = 0;

for i in xrange(testCases):
    line = raw_input().split();
    a = int(line[0]);
    b = int(line[1]);
    number = int(line[2]);
    total = total + (b - a + 1) * number;

print total / numberOfJars
