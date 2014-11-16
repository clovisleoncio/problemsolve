#!/usr/bin/env python

raw_input();

numbers = [int(x) for x in raw_input().split()];

count = len(numbers) - 1;

out = numbers[count];

while numbers[count - 1] > out:
	numbers[count] = numbers[count - 1];
	print ' '.join(str(x) for x in numbers);
	count = count - 1;

numbers[count] = out

print ' '.join(str(x) for x in numbers);