#!/usr/bin/env python


a = [int(x) for x in raw_input().strip().split(' ')]
b = [int(x) for x in raw_input().strip().split(' ')]

aPoints = 0
bPoints = 0

for x in xrange(0,3):
	if a[x] > b[x]:
		aPoints += 1
	elif b[x] > a[x]:
		bPoints += 1

print aPoints, bPoints
