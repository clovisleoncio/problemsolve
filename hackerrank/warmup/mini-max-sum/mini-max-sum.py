#!/usr/bin/env python

numbers = [int(x) for x in raw_input().split()]
numbers.sort()

print sum(numbers[:4]), sum(numbers[1:])