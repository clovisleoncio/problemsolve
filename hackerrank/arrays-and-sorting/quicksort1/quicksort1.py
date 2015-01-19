#!/usr/bin/env python

raw_input();

numbers = [int(x) for x in raw_input().split()];

p = numbers[0];

array = [];
array.extend([x for x in numbers if x < p]);
array.append(p);
array.extend([x for x in numbers if x > p]);

print ' '.join(str(x) for x in array);