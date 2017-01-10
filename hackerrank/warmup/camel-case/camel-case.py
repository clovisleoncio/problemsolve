#!/usr/bin/env python

phrase = [ord(x) for x in raw_input()]

inferiorLimit = ord('a')
superiorLimit = ord('z')

print len(filter(lambda a: a < inferiorLimit or a > superiorLimit, phrase)) + 1