import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
		
	try (Scanner scn = new Scanner(System.in)) {
        int t = scn.nextInt();

        while(t-- > 0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a+b);
        }
    }
	}
}
