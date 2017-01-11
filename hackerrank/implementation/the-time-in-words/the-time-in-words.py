#!/usr/bin/env python

numbers = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten', 'eleven', 'twelve', 'thirteen', 'fourteen', 'fifteen', 'sixteen', 'seventeen', 'eighteen', 'nineteen', 'twenty', 'twenty one', 'twenty two', 'twenty three', 'twenty four', 'twenty five', 'twenty six', 'twenty seven', 'twenty eight', 'twenty nine', 'thirty']

def translate(number):
	if number < len(numbers) + 1:
		return numbers[number - 1]
	return 'NOT YET'

def translate_hour_minute(hour, minute):
	if minute == 0:
		print translate(hour) + ' o\' clock'
	else:
		past_to = 'past'
		if minute > 30:
			past_to = 'to'
			hour += 1
			minute = 60 - minute

		minutelabel = translate(minute) + ' minutes'
		if minute == 1:
			minutelabel = 'one minute'
		elif minute == 15:
			minutelabel = 'quarter'
		elif minute == 30:
			minutelabel = 'half'
		print minutelabel, past_to, translate(hour)

h = int(raw_input().strip())
m = int(raw_input().strip())

translate_hour_minute(h, m)