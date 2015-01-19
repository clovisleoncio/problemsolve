#!/usr/bin/env python

counting = [0 for x in xrange(26)];

def countOcurrences(string, factor):
    base = ord('a');
    for c in string:
        index = ord(c) - base;
        counting[index] = counting[index] + factor;

countOcurrences(raw_input(), 1);
countOcurrences(raw_input(), -1);

sum = 0;
for number in counting:
    sum = sum + abs(number);

print sum;
