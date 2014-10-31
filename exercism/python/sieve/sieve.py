def findNextPrime(index):
	return 10

def sieve(number):
	flags = [i > 1 for i in xrange(number)]
	index = 0
	index = findNextPrime(index)
	print index
	return flags