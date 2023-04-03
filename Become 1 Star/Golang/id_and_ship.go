package main
import "fmt"

func main(){
	// your code goes here
	var t int
	var c string
	fmt.Scan(&t)
	
	for t>0{
	    fmt.Scan(&c)
	   
	        if c == "B" || c == "b" {
	            fmt.Println("BattleShip")
	        }
	        if c == "C" || c == "c" {
	            fmt.Println("Cruiser")
	        }
	        if c == "D" || c == "d" {
	            fmt.Println("Destroyer")
	        }
	        if c == "F" || c == "f" {
	            fmt.Println("Frigate")
	        }
	      
	    t--
	}
}
