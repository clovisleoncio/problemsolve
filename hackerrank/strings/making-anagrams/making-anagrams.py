#!/usr/bin/env python

string1 = raw_input()
string2 = raw_input()

count = [0 for x in range(ord('a'), ord('z') + 1)]

base = ord('a')

for x in string1:
	index = ord(x) - base
	count[index] += 1

for x in string2:
	index = ord(x) - base
	count[index] -= 1

count = [abs(x) for x in count]

print sum(count)