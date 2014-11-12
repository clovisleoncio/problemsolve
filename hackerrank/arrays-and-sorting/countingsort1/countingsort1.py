#!/usr/bin/env python

raw_input();

numbers = [0 for x in xrange(100)];

for x in raw_input().split():
	index = int(x);
	numbers[index] = numbers[index]+1

print ' '.join(str(x) for x in numbers);