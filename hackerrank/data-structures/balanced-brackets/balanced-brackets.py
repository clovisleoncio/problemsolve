#!/usr/bin/env python

inputs = int(raw_input())

openings = '[{('
reference = {']' : '[', '}' : '{', ')' : '('}

def is_balanced(input):
	stack = []
	for c in input:
		if c in openings:
			stack.append(c)
		else:
			if len(stack) == 0 or stack.pop() != reference[c]:
				return 'NO'
	if len(stack) == 0:
		return 'YES'
	else:
		return 'NO'

for i in range(0, inputs):
	input = raw_input()
	print is_balanced(input)