#!/usr/bin/env python

def ransom_note(magazine, rasom):
	magazine_dict = {}
	for word in magazine:
		count = 1
		if word in magazine_dict:
			count = magazine_dict[word] + 1
		magazine_dict[word] = count
	for word in ransom:
		if word not in magazine_dict or magazine_dict[word] == 0:
			return False
		magazine_dict[word] = magazine_dict[word] - 1
	return True

raw_input()
#m, n = map(int, raw_input().strip().split(' '))
magazine = raw_input().strip().split(' ')
ransom = raw_input().strip().split(' ')
answer = ransom_note(magazine, ransom)
if(answer):
    print "Yes"
else:
    print "No"