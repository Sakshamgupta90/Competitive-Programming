package main
import "fmt"

func main(){
    var t int
    fmt.Scanln(&t)
    
    for i := 0; i < t; i++{
        var a,b int
        fmt.Scanln(&a, &b)
        
        
        if a>b{
            fmt.Println(">")
        } else if a==b {
            fmt.Println("=");
        } else {
            fmt.Println("<")
        }
    }
}