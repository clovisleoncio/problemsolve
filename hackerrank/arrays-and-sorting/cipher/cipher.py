#!/usr/bin/env python

def reverseXor(xor, known):
	if xor == 0:
		if known == 0:
			return 0;
		else:
			return 1;
	else:
		if known == 0:
			return 1;
		else:
			return 0;

n, k = [int(x) for x in raw_input().split()];

input = raw_input();

xors = [0 for x in xrange(k-1)];

for x in xrange(n):
	xor = 0;
	for i in xrange(x, x+k-1):
		xor = xor ^ xors[i]
	known = int(input[x]);
	result = reverseXor(xor, known);
	xors.append(result)

print ''.join(str(x) for x in xors[k-1:]);