#!/usr/bin/env python

raw_input();

array = [int(x) for x in raw_input().split()];

def doSort(begin, end):

	if (begin < end):
		pivot = array[end];
		firstAvailable = begin;
		for i in xrange(begin, end + 1):
			if (array[i]) <= pivot:
				if (i != firstAvailable):
					aux = array[i];
					array[i] = array[firstAvailable];
					array[firstAvailable] = aux;
				firstAvailable = firstAvailable + 1;

		print ' '.join(str(x) for x in array);
		doSort(begin, firstAvailable - 2);
		doSort(firstAvailable, end);

def sort():
	doSort(0, len(array) - 1);

sort();