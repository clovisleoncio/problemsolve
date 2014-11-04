#!/usr/bin/env python

string = raw_input();
items = set(string);

numberOfOdds = sum([string.count(item) % 2 for item in items]);

if numberOfOdds > 1:
    print 'NO';
else:
    print 'YES';
