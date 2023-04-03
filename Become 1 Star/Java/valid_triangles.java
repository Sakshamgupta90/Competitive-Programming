
import java.util.*;

class valid_triangles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner scn = new Scanner(System.in)) {
            int t = scn.nextInt();
            for(int i = 0; i < t; i++){
                int a = scn.nextInt();
                int b = scn.nextInt();
                int c = scn.nextInt();
                
                if(a + b + c == 180){
                    System.out.println("YES");
                }else{
                     System.out.println("NO");
                }
            }
        }
	}
}
