#!/usr/bin/env python

inputSize = int(raw_input().split()[0]);

members = [long(raw_input(), 2) for i in xrange(inputSize)];

maxSkills = 0;
numberOfTeams = 0;

for i in xrange(len(members)):
    for j in xrange(i + 1, len(members)):
        skills = members[i] | members[j]
        numberOfSkills = bin(skills).count('1');
        if numberOfSkills == maxSkills:
            numberOfTeams = numberOfTeams + 1;
        elif numberOfSkills > maxSkills:
            maxSkills = numberOfSkills;
            numberOfTeams = 1;

print maxSkills;
print numberOfTeams;