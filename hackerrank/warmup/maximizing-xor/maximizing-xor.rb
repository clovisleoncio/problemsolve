#!/usr/bin/env ruby

l = gets.to_i
r = gets.to_i
maxXor = 0
(l..r).each {|i|
  (i+1..r).each {|j|
    xor = i ^ j
    if (xor > maxXor) then
      maxXor = xor
    end
  }
}
puts maxXor
