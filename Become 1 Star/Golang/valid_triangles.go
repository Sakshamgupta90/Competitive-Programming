package main
import "fmt"

func main(){
	var t int 
	fmt.Scanln(&t)
	for i := 0; i < t; i++ {
		     var a, b, c int 
		    fmt.Scanln(&a, &b, &c)
		    if a + b + c == 180 {
		        fmt.Println("YES")
		    }else{
		         fmt.Println("NO")
		    }
		}
    }
