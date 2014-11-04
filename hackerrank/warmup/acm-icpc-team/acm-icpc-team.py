#!/usr/bin/env python

inputSize = int(raw_input().split()[0]);

members = [int(raw_input(), 2) for i in xrange(inputSize)];

maxSkills = 0;
numberOfTeams = 0;

for i in xrange(len(members)):
    for j in xrange(i + 1, len(members)):
        numberOfSkills = members[i] | members[j]
        if numberOfSkills == maxSkills:
            numberOfTeams = numberOfTeams + 1;
        elif numberOfSkills > maxSkills:
            maxSkills = numberOfSkills;
            numberOfTeams = 1;

print bin(maxSkills).count('1');
print numberOfTeams;
