#!/usr/bin/env python

input = raw_input().split()

size = int(input[0])
rotations = int(input[1])

integers = [int(x) for x in raw_input().split()]

split = rotations % size

rotation = integers[split:] + integers[:split]

print ' '.join(str(x) for x in rotation)