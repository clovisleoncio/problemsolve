#!/usr/bin/env python

for x in xrange(int(raw_input())):
	raw_input();
	routes = 1L;
	for n in raw_input().split():
		routes = routes * int(n);
	print routes % 1234567;