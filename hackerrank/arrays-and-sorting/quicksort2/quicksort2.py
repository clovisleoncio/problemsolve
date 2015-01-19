#!/usr/bin/env python

def sort(array):
	if len(array) <= 1:
		return array;
	p = array[0];
	arrayToReturn = sort([x for x in array if x < p]);
	arrayToReturn.append(p);
	arrayToReturn.extend(sort([x for x in array if x > p]));
	print ' '.join(str(x) for x in arrayToReturn);
	return arrayToReturn;

raw_input();
array = [int(x) for x in raw_input().split()];

sort(array);