import java.util.Scanner;

public class sum_of_digits {
    public static void main (String[] args) throws java.lang.Exception{
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();

            for(int i=0;i<n;i++){
                int a = scn.nextInt();
                int sum = 0 ;
                while(a>0){
                int temp = a%10;
                sum +=temp;
                a/=10;
                }
                System.out.println(sum);
            }
    }
    }
}
