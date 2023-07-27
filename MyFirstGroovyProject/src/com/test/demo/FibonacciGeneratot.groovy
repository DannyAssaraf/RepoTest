package com.test.demo

class FibonacciGenerator {
	static int fibonacci(int n) {
// This class is getting int as input and return the fibonacci series for this number
		if (n <= 1) {
			return n
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2)
		}
	}
}

def numbers = [	5,	8,	10] // Replace with your desired numbers

numbers.each { number ->
	println "Fibonacci series for $number:"
	(0..number).each { index ->
		println FibonacciGenerator.fibonacci(index)
	}
	println "------------------"
}