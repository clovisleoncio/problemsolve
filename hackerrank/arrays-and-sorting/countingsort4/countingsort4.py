#!/usr/bin/env python

inputSize = int(raw_input());

lists = [[] for x in xrange(100)];

for k in xrange(inputSize):
	lineSplit = raw_input().split();
	position = int(lineSplit[0])
	
	if k < inputSize / 2:
		text = '-';
	else:
		text = lineSplit[1];

	lists[position].append(text);

print ' '.join(' '.join(a for a in x) for x in lists)