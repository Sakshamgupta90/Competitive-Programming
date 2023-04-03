package main
import "fmt"

func main() {
    	var (
		t = 0
		a = 0
		b = 0
	)
	fmt.Scanln(&t)
	for i := 0; i < t; i++ {
		fmt.Scanln(&a, &b)
		fmt.Println(a % b)
	}
}