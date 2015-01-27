#!/usr/bin/env python

raw_input();

numbers = [int(x) for x in raw_input().split()];

numbers.sort();

print numbers[(len(numbers) / 2)];
