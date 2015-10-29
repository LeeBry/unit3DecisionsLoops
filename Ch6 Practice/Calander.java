public class Calander
{
    public static void calander()
    {
        System.out.println("Su M T W Th F Sa");
        int d=1;
        while (d<31)
        {
            for (int i=1; i<=7; i++)
            {
                    System.out.print(d+" ");
                    d++;
                    if (d>31)
                    {
                        break;
                    }
                    //continue;
            }
            System.out.println("\n");
        }
            
        }
}