#!/usr/bin/env ruby

numberOfTestCases = gets.to_i

(1..numberOfTestCases).each {
  word = gets.chomp
  operations = 0
  (0...word.size/2).each {|i|
    operations += (word[i].ord - word[-(i+1)].ord).abs
  }
  puts operations
}
