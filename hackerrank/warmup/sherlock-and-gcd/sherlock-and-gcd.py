#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    raw_input();
    items = [int(x) for x in raw_input().split()];
    first = items[0];
    items = items[1:];

    divisors = [x for x in xrange(2, first + 1) if first % x == 0];

    for item in items:
        divisors = [x for x in divisors if item % x == 0];

    if len(divisors) > 0:
        print 'NO';
    else:
        print 'YES';
