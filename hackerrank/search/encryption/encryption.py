#!/usr/bin/env python

import math

text = raw_input();

length = len(text)
sqrtLen = math.sqrt(length)
ceil = int(math.ceil(sqrtLen))
floor = int(math.floor(sqrtLen))
if floor * ceil < length:
	floor = floor + 1

for y in xrange(ceil):
	print ''.join(text[x * ceil + y] for x in xrange(floor) if x * ceil + y < length),