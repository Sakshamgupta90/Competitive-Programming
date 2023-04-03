import java.util.Scanner;

public class id_and_ship {
        public static void main (String[] args) throws java.lang.Exception
        {
            try (// your code goes here
            Scanner scn = new Scanner(System.in)) {
                int t = scn.nextInt();
                
                for(int i = 0; i < t; i++){
                    char ch = scn.next().charAt(0);
                    
                    if(ch == 'B' || ch == 'b'){
                        System.out.println("BattleShip");
                    }else if(ch == 'C' || ch == 'c'){
                        System.out.println("Cruiser");
                    }else if(ch == 'D' || ch == 'd'){
                        System.out.println("Destroyer");
                    }else
                    System.out.println("Frigate");
                }
            }
        }
}
