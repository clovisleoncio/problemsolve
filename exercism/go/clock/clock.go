package clock

import (
	"fmt"
)

const testVersion = 4

type Clock struct {

	hour   int
	minute int
}

func New(hour, minute int) Clock {

	for hour < 0 {
		hour += 24
	}

	clock := Clock{hour, 0}

	clock = clock.Add(minute)

	return clock
}

func (clock Clock) String() string {
	return fmt.Sprintf("%02d:%02d", clock.hour, clock.minute)
}

func (clock Clock) Add(minutes int) Clock {

	clock.minute += minutes
	if clock.minute >= 0 {
		clock.hour = (clock.hour + clock.minute / 60) % 24
		clock.minute = clock.minute % 60
	} else {
		for clock.minute < 0 {
			clock.hour = (clock.hour + 23) % 24
			clock.minute += 60
		}
	}

	return clock
}
