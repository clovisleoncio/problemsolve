#!/usr/bin/env python

raw_input();
listA = [int(x) for x in raw_input().split()];
raw_input();
listB = [int(x) for x in raw_input().split()];

listB.sort()

factor = listB[0]

occurrences = [0 for x in xrange(100)]

for x in listB:
	index = x - factor
	occurrences[index] = occurrences[index] + 1

for x in listA:
	index = x - factor
	occurrences[index] = occurrences[index] - 1

print ' '.join(str(x + factor) for x in xrange(100) if occurrences[x] > 0)