import java.util.Scanner;

/**
 * Write a description of class RPS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPS
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 

        if( ((player1.equals("rock")&& player2.equals("rock")||(player1.equals("paper")&& player2.equals("paper")))||(player1.equals("scissors")&& player2.equals("scissors")))){
            System.out.println("Tie");
        }
        else if( ((player1.equals("paper")&&player2.equals("rock"))||(player1.equals("rock")&&player2.equals("scissors")))||(player1.equals("scissors")&&player2.equals("paper"))){
            System.out.println("Player 1 wins");

        }
        else{System.out.println("Player 2 wins");
        }
    }
}
