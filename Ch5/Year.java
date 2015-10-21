import java.util.Scanner;
/**
 * Write a description of class Year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Year
{
    public Year()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the year: ");
        int years = scan.nextInt();
        System.out.println(Year.LeapYear(years));
    }
    /**
    * Figures out if the year is a leap year or not. If year
    * is divisible by 4, it is a leap year, with exceptions of 100, which is not a leap year
    */
    public static String  LeapYear(int years)
    {
     if (years%4 ==0)
     {
        if (years%100==0)
        {
           if(years %400==0)
         {
            return "Is a leap year";
         }
         else
         {
             return "Is not a leap year" ;
         }
        }
        return "Is a leap year";
     }
     else
     {  
        return "Is not a leap year";
     }
     
    }

    
}