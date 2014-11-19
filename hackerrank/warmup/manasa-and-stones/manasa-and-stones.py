#!/usr/bin/env python

for i in xrange(int(raw_input())):
    n = int(raw_input()) - 1;

    a = int(raw_input());
    b = int(raw_input());

    value = n * a;

    results = set([value]);

    for x in xrange(n):
        value = value - a + b;
        results.add(value);

    print ' '.join(str(x) for x in sorted(results));