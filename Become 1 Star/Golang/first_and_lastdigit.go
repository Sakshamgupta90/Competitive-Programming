package main

import (
	"fmt"
)

func sum(n int) int {
	var first int
	last := n % 10
	for n != 0 {
		first = n % 10
		n = n / 10
	}
	return first + last
}

func main() {
	var t, n int
	fmt.Scanf("%d%d", &t)
	for i := 0; i < t; i++ {
		fmt.Scanf("%d%d", &n)
		fmt.Printf("%d\n", sum(n))
	}
}