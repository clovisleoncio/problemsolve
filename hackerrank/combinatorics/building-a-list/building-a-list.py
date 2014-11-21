#!/usr/bin/env python

def printLists(text):

	begin = 0;
	while begin < len(text):
		for x in xrange(begin, len(text)):
			print ''.join(text[begin:x+1]);
		begin = begin + 1;

for x in xrange(int(raw_input())):
	raw_input();
	text = sorted(raw_input());

	printLists(text);