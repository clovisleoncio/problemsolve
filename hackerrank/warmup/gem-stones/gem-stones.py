#!/usr/bin/env python

numberOfStones = int(raw_input());

gemstones = [chr(i + ord('a')) for i in xrange(26)];

for i in xrange(numberOfStones):
    stone = raw_input();

    elements = list(gemstones);

    for element in elements:
        if element not in stone:
            gemstones.remove(element);

print len(gemstones)
