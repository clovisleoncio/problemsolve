#!/usr/bin/env python

numberOfTestCases = int(raw_input());

for i in xrange(numberOfTestCases):
    input = raw_input().split();
    money = int(input[0]);
    price = int(input[1]);
    gift = int(input[2]);

    chocolates = money / price;
    packages = chocolates;

    while packages >= gift:
        freeChocolates = packages / gift;
        chocolates = chocolates + freeChocolates;
        packages = packages % gift + freeChocolates;

    print chocolates
