#!/usr/bin/env python

raw_input();

numbers = [int(x) for x in raw_input().split()];

for x in xrange(1, len(numbers)):
	if numbers[x] < numbers[x - 1]:
		out = numbers.pop(x);
		newPosition = x - 1;
		while numbers[newPosition] > out and newPosition >= 0:
			newPosition = newPosition - 1;
		numbers.insert(newPosition + 1, out);
	print ' '.join(str(n) for n in numbers);