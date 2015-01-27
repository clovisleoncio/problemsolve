#!/usr/bin/env python

for t in xrange(int(raw_input())):
	raw_input();
	count = {};
	for x in raw_input().split():
		index = int(x) - 1;
		if index in count:
			count[index] = count[index] + 1;
		else:
			count[index] = 1;
	sum = 0;
	for i in count.keys():
		sum = sum + count[i] * (count[i] - 1);
	print sum;