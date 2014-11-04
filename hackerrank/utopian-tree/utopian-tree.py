#!/usr/bin/env python

def size(cycles):
  size = 1
  for i in xrange(cycles):
    if (i % 2) != 0:
      size = size + 1
    else:
      size = size * 2
  return size

inputNumber = int(raw_input())

for i in xrange(inputNumber):
  cycles = int(raw_input())
  print size(cycles)
