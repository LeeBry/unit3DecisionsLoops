import java.util.Scanner;
import java.util.Random;
public class MontyHall
{
    public static void MontyHall()
    {
     Scanner scan= new Scanner(System.in);
     System.out.println("Welcome to Monty Hall!"+"\n"+"\n");
    
     
         System.out.println("We have 3 doors, behind 1 contains a car,"+"\n"+"behind the other two are goats");
         System.out.println("Please pick a number 1-3");
         int choice= scan.nextInt();
         Random gen= new Random();
         int correct= gen.nextInt(3)+1;
     if( choice== correct){ 
         correct= gen.nextInt(3)+1; // makes sure the correct door is not the chosen door.
        }
        
         System.out.println(correct);
         int wrong= gen.nextInt(3)+1;
     if ( wrong== correct || wrong== choice){
             wrong= gen.nextInt(3)+1; // makes sure that when the player makes a choice of changing, they will get the car.
            }
         System.out.println("Door "+wrong+" has a goat"); 

         
         while(choice<=3 && choice>=1)
         {
           System.out.println("Would you like to switch doors?(y/n)");
           String answer=scan.next();
           answer.toLowerCase();

           if (answer.equals("y"))
           {
              System.out.println("You have won a car");
              break;
           }
           else
           {
             System.out.println("You have earned a goat");
             break;
            }
     }
         
    }
}
    