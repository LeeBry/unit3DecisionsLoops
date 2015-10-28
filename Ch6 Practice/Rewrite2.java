// rewrite into a while loop
import java.util.Scanner;
public class Rewrite2
{
    public static void rewrite2()
    {
     Scanner in= new Scanner(System.in);
     int n= in.nextInt();
     double x=0;
     double s=1;
     while (s>0.01)
     {
         s=1.0/(1+n*n);
         n++;
         x=x+s;
     }
      
    }
}