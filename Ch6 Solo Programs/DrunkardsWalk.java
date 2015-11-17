
import java.util.Random;
public class DrunkardsWalk
{
    public static void DrunkardsWalk()
    {
        int x= 0;
        int y= 0;
        Random gen= new Random();
        int direction;
        int walked= 100;
        for (int i =0; i !=walked; i++)
        {
            direction= gen.nextInt(4)+1;
            //1= North y+1.
            //2= East x+1.
            //3= South y-1.
            //4= West x-1.
            if (direction ==1)
            {
                y+=1;
                System.out.println("Walked North and you have reached point ("+x+","+y+")");
            }
            else if(direction ==2)
            {
                x+=1;
                System.out.println("Walked East and you have reached point ("+x+","+y+")");
            }
            else if(direction ==3)
            {
                y-=1;
                System.out.println("Walked South and you have reached point ("+x+","+y+")");
            }
            else if(direction ==4)
            {
                x-=1;
                System.out.println("Walked West and you have reached point ("+x+","+y+")");
            }
        }
        System.out.println("You have walked 100 intersections, and your final point is("+x+","+y+")");       
    }
}
