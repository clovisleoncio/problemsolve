#!/usr/bin/env python

t = int(raw_input().split()[1]);

sizes = raw_input().split()

for i in xrange(t):
	input = raw_input().split();
	entry = int(input[0]);
	exit = int(input[1]) + 1;

	width = min(sizes[entry:exit]);

	print width