#!/usr/bin/env ruby

gets

sticks = gets.split.map {|x| x.to_i}

cuts = sticks.size

while (cuts > 0)
  puts cuts
  min = sticks.min
  sticks.delete_if {|a| a <= min}
  sticks = sticks.map {|a| a - min}
  cuts = sticks.size
end
