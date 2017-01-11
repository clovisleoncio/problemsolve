#!/usr/bin/env python

division_result = int(raw_input().split()[1])

values = [int(x) for x in raw_input().split()]

result = 0

for i in range(0, len(values)):
	for j in range(i + 1, len(values)):
		if (values[i] + values[j]) % division_result == 0:
			result += 1

print result