#!/usr/bin/env python

def count_toys(prices, money):
	count = 0;
	for price in prices:
		if (price <= money):
			money = money - price;
			count = count + 1;
		else:
			return count;

n, k = [int(x) for x in raw_input().split()];

prices = [int(x) for x in raw_input().split()];
prices.sort();

print count_toys(prices, k);