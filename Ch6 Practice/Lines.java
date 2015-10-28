import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
/**
 * class circles draws a circle with x radius
 * 
 * @Bryce Lee 
 * @param int stars must be above 0, and an integer
 */
public class Lines
{
  public double draw(Graphics2D g2)
  {
      Scanner scan= new Scanner(System.in);
      System.out.println("Pick a number");
      double x =scan.nextDouble();
      while (x>=0)
      {
          Ellipse2D.Double moon= new Ellipse2D.Double(x, 75, 75, 75);
      }
      return x;
  }

}
