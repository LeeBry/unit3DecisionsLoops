import java.util.Scanner;
public class Diamond2
{
    public static void Diamond2()
    {
        Scanner scan= new Scanner(System.in);
        String dia= "*";
        String space=" ";
        System.out.println("What is the side length of the diamond: ");
        int side= scan.nextInt();
        int layer= 1;
        int max= 1; 
        int total = side-1;
        while (layer<side)
        {
             for(int m=0; m<total; m++)
                { 
                  System.out.print(space);
                }
            for (int i=0; i<max; i++)
            {
               
                System.out.print(dia);

            }
            layer++;
            System.out.println("");
            total -=1;
            max+=2;
        }
         while (layer>=1)
        {
            for(int x=0; x<total; x++)
                { 
                  System.out.print(space);
                }
            for (int i=0; i<max; i++)
            {
                
                System.out.print(dia);
                
            }
            layer--;
            System.out.println("");
            max-=2;
            total+=1;
        }
    }
}