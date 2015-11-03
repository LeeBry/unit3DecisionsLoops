import java.util.Scanner;
public class FibonacciNumbers
{
    public static void FibonacciNumbers()
    {
        int fold1= 1;
        int fold2= 1;
        int foldNew= fold1+fold2;
        Scanner scan= new Scanner(System.in);
        System.out.println("What nth fibonacci number would you like to calculate?"+"\n"+"\n");
        int num= scan.nextInt();
        System.out.println("\n"+"\n");
        for (int i=0; i!=num; i++)
        {
            fold1=fold2;
            fold2=foldNew;
            foldNew= fold1+fold2;
            System.out.println(foldNew);
        }
        
        
        System.out.println("The "+num+"th Fibbonacci number is: "+foldNew);
    }
}