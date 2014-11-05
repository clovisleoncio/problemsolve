#!/usr/bin/env python

def calc(a, b, n, value, list):
	if n == 1:
		list.add(value + a);
		list.add(value + b);
	else:
		calc(a, b, n - 1, value + a, list);
		calc(a, b, n - 1, value + b, list);

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    n = int(raw_input()) - 1;
    a = int(raw_input());
    b = int(raw_input());

    results = set([]);

    calc(a, b, n, 0, results);

    results = sorted(results);

    print ' '.join(str(x) for x in results);
