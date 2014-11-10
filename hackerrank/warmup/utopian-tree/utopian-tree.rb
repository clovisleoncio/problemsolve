#!/usr/bin/env ruby

inputNumber = gets.to_i

(1..inputNumber).each {
  cycles = gets.to_i

  size = 1;
  (1..cycles).each {|i|
    size = (i % 2 != 0) ? size * 2 : size + 1
  }

  puts size
}
