import java.util.Scanner;
public class Diamond
{
    public static void Diamond()
    {
        Scanner scan= new Scanner(System.in);
        String dia= "*";
        String space=" ";
        System.out.println("What is the side length of the diamond: ");
        int side= scan.nextInt();
        int layer= 1;
        int max= 1; 
       
        while (layer<side)
        {
            for (int i=0; i<max; i++)
            {

                System.out.print(dia);
                
            }
            layer++;
            System.out.println("\n");
            max+=2;
        }
         while (layer>=1)
        {
            for (int i=0; i<max; i++)
            {
                System.out.print(dia);
                
            }
            layer--;
            System.out.println("\n");
            max-=2;
        }
    }
}