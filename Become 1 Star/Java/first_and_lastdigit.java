import java.util.*;


class first_and_lastdigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  try (Scanner get = new Scanner(System.in)) {
        int i=0,sum=0,rem=0,t = get.nextInt();
          while(i<t)
          {
              int a = get.nextInt();
              sum = a%10;
              while(a>0)
              {
                  rem = a%10;
                  a = a/10;
              }
              sum = sum+rem;
              System.out.println(sum);
              i++;
          }
    }
	}
}


