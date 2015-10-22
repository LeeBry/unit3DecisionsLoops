import java.util.Scanner;
/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
    public Spectrum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the wavelength: ");
        double spec = scan.nextInt();
        System.out.println(Spectrum.specInfo(spec)); 
    }
    public static String specInfo(double spec)
    {
        if(spec > Math.pow(10,-1))
        {
            return " This is a Radio wave";
        }
        else if( spec>= Math.pow(10,-3) && spec<= Math.pow(10,-1))
        {
            return " This is a Microwaves";
        }
        else if( spec>= 7*Math.pow(10,-7) && spec<= Math.pow(10,-3))
        {
            return "This is a Infrared";
        }
        else if( spec>= 4*Math.pow(10,-7) && spec<= 7*Math.pow(10,-7))
        {
            return " This is a Visible light";
        }
        else if( spec>= Math.pow(10,-8) && spec<= 4*Math.pow(10,-7))
        {
            return " This is a Ultraviolet";
        }
        else if( spec>= Math.pow(10,-11) && spec<= Math.pow(10,-8))
        {
            return " This is a X-Rays";
        }
        else if( spec< Math.pow(10,-11))
        {
            return " This is a Gamma ray";
        }
        else
        {
            return " An unknown wavelength!";
        }
    }
}