#!/usr/bin/env python

raw_input();

input = raw_input().split();

sticks = [int(x) for x in input];

cuts = len(sticks);
while cuts > 0:
    print cuts
    smaller = min(sticks);
    sticks = [x - smaller for x in sticks if x > smaller];
    cuts = len(sticks);
