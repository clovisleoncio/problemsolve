#!/usr/bin/env python

input = raw_input()

base = 'SOS'

differences = 0
reference_index = 0
for c in input:
	reference_char = base[reference_index]
	if c != reference_char:
		differences += 1
	reference_index = (reference_index + 1) % len(base)

print differences