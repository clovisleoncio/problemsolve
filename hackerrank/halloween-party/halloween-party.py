#!/usr/bin/env python

numberOfCases = int(raw_input());

for i in xrange(numberOfCases):
  k = int(raw_input());
  print (k/2) * (k/2 + k%2);
