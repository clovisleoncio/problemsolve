#!/usr/bin/env python

fatoriais = [1, 1];

def fatorial(numero):

	if numero > len(fatoriais) - 1:
		for x in xrange(len(fatoriais), numero + 1):
			fatoriais.append(fatoriais[x - 1] * x);
	return fatoriais[numero];

for x in xrange(int(raw_input())):
	n = int(raw_input());
	k = int(raw_input());

	print (fatorial(n + k - 1) / (fatorial(k) * fatorial(n - 1))) % 10**9;