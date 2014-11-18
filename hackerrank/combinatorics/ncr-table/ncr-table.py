#!/usr/bin/env python

fatoriais = [1, 1];

def fatorial(numero):

	if numero > len(fatoriais) - 1:
		for x in xrange(len(fatoriais), numero + 1):
			fatoriais.append(fatoriais[x - 1] * x);
	return fatoriais[numero];

for x in xrange(int(raw_input())):
	n = int(raw_input());

	for i in xrange(n + 1):
		print fatorial(n) / (fatorial(i) * fatorial(n - i)),
	print