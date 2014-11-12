#!/usr/bin/env python

numberOfTestCases = int(raw_input());

def findNext(w):
	size = len(w);

	for i in xrange(size -1, -1, -1):
		for j in xrange(i-1, -1, -1):
			if w[i] > w[j]:
				return w[:j] + w[i] + w[j] + ''.join(x for x in sorted(w[j+1:i] + w[i+1:]));

	return 'no answer'

for i in xrange(numberOfTestCases):
	w = raw_input();

	print findNext(w);