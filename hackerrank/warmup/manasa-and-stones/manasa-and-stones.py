#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    n = int(raw_input()) - 1;
    a = int(raw_input());
    b = int(raw_input());

    combinations = 2 ** n;

    mask = '{0:0' + str(n) + 'b}';

    results = [mask.format(k).count('0') * a + mask.format(k).count('1') * b for k in xrange(combinations)];

    results = sorted(set(results));

    print ' '.join(str(x) for x in results);
