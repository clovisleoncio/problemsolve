#!/usr/bin/env python

n, k, q = [int (x) for x in raw_input().split()];
k = k % n;

numbers = [int (x) for x in raw_input().split()];

rotated = numbers[-k:];
rotated.extend(numbers[0:-k]);

for i in xrange(q):
    print rotated[int(raw_input())];
