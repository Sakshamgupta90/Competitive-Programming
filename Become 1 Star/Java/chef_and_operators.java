import java.util.Scanner;

public class chef_and_operators {
    public static void main (String[] args) throws java.lang.Exception
	{
    try(Scanner scn = new Scanner(System.in);){
    int n = scn.nextInt();
    
    for(int i =0;i<n;i++)
    {
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>b)
            System.out.println(">");
        else if(a==b)
            System.out.println("=");
        else
            System.out.println("<");
    }
}
}
}
