import java.util.*;

class atm{
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            float x = sc.nextFloat();
                float y = sc.nextFloat();
                
                if(x%5==0 && y>=x+0.5f)
                System.out.println(y-x-0.5f);
                
                else{
                    System.out.println(y);
                }
        }
        
    }
}
