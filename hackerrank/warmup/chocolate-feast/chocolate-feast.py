#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    money, price, gift = [int(x) for x in raw_input().split()];

    chocolates = money / price;
    packages = chocolates;

    while packages >= gift:
        freeChocolates = packages / gift;
        chocolates = chocolates + freeChocolates;
        packages = packages % gift + freeChocolates;

    print chocolates
