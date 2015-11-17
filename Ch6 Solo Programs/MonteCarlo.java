
import java.util.Random;
/**
 * This program computes an estimate of pi by simulating dark throws onto a square.
 * 
 */
public class MonteCarlo
{
    public static void main(String[] arg)
    {
        final int TRIES = 10000;
        Random gen = new Random();
        
        int hits=0;
        for (int i= 1; i<= TRIES; i++)
        {
            double r= gen.nextDouble();
            double x= -1+2*r;
            r= gen.nextDouble();
            double y= -1+2*r;
            if (x*x+y*y <=1)
            {
                hits++;
            }
        }
        double piEstimate = 4.0* hits/ TRIES;
        System.out.println("Estimate for pi: "+ piEstimate);
        }
        
    }
