#!/usr/bin/env python

s = set(raw_input().lower());
s.discard(' ');
if len(s) == 26:
	print 'pangram';
else:
	print 'not pangram';