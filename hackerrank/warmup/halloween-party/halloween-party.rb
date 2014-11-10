#!/usr/bin/env ruby

numberOfTestCases = gets.to_i

(1..numberOfTestCases).each {
  k = gets.to_i
  puts (k/2) * (k/2 + k%2)
}
