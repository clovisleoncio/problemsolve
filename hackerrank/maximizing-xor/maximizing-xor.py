#!/usr/bin/env python

# Complete the function below.


def  maxXor( l,  r):
  r = r + 1
  maxXor = 0
  for i in xrange(l, r):
    for j in xrange(i, r):
      xorValue = i ^ j
      if (xorValue > maxXor):
        maxXor = xorValue
  return maxXor



_l = int(raw_input());


_r = int(raw_input());

res = maxXor(_l, _r);
print(res)
