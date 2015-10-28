public class NestedLoops
{
    public static void loops()
    {
        int ones=1;
        int tens=1;
        for (int t=1; t<3; t++)
        {
            tens=t;
            for (int o=1;o<=4;o++)
            {
                ones=o;
                System.out.println(tens+""+ones);
            }
        }
                
            
    }
        
    
}