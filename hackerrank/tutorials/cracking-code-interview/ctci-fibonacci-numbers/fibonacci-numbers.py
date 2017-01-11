#!/usr/bin/env python

def fibonacci(n):
	if n == 0:
		return 0
	elif n == 1:
		return 1
	else:
		before1 = 0;
		before2 = 1;
		for i in range(0, n - 1):
			sum = before1 + before2
			before1 = before2
			before2 = sum
		return sum

n = int(raw_input())
print(fibonacci(n))
