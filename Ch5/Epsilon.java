import java.util.Scanner;

/**
 * "Write a program that reads a floating-point number and prints "zero" 
 * if the number is zero. Otherwise, print "positive" or "negative." Add "small"
 * if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000." 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
    public static final double EPSILON= 1e-12;
    public static void main(String[] arg)
    {
         Scanner in = new Scanner(System.in);
         System.out.print(" Enter a floating-point number:" );
         double i = in.nextDouble();
         String adj= " ";
         if( Math.abs(i)<1.0)
        {
            adj= "small(小）";
        }
        else if (Math.abs(i)>1000000)
        {
            adj= "large（大）";
        }
        if (Math.abs(i-0)<EPSILON)
        {
            System.out.println("Its a Zero!");
        }
        else if(i>0)
        {
            System.out.println("It's a "+adj+" positive number");
        }
        else
        {
            System.out.println("It's a "+adj+" negative number");
        }
    }
}