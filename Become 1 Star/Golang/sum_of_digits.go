// Problem Code: FLOW006

package main
import "fmt"

func main(){
	
	var t int 
	fmt.Scan(&t);
	
	
	for t>0 {
	    var num int
	    fmt.Scan(&num)
	    
	    var sum int=0
	    
	    for num>0 {
	        sum=sum+num%10
	        num=num/10
	    }
	    
	    fmt.Println(sum)
	    
	    t--
	}
	
}
