#!/usr/bin/env ruby

t = gets.split[1].to_i

sizes = gets.split

(1..t).each { |i|
  input = gets.split
  entry = input[0].to_i
  exit = input[1].to_i

  path = sizes.slice(entry, exit - entry + 1)

  puts path.min
}
