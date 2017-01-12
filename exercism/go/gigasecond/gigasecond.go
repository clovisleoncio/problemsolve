package gigasecond

import (
	"time"
)

const testVersion = 4
const gigasecond = 1000000000

func AddGigasecond(birth time.Time) time.Time {
	return birth.Add(time.Duration(gigasecond) * time.Second)
}
