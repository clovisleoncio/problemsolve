#!/usr/bin/env python

raw_input()

socks = [int(x) for x in raw_input().split()]

colors = set(socks)

pairs = 0
for color in colors:
	pairs += socks.count(color) / 2

print pairs