import java.util.Scanner;

/**
 * Write a description of class RockPaperScissors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockPaperScissors
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 

        if( player1.equals("rock")){
            if (player2.equals("rock")){
                System.out.println("tie");
            }
            else if (player2.equals("scissors")){
                System.out.println("Player 1 wins");
            }
            else{
                System.out.println("Player 2 wins");
            }
        }
        else if( player1.equals("paper")){
            if (player2.equals("rock")){
                System.out.println("Player 1 wins");
            }
            else if (player2.equals("scissors")){
                System.out.println("Player 2 wins");
            }
            else{
                System.out.println("Tie");
            }
        } 
        else{
            if (player2.equals("rock")){
                System.out.println("Player 2 wins");
            }
            else if (player2.equals("scissors")){
                System.out.println("Tie");
            }
            else{
                System.out.println("Player 1 wins");
            }
        } 
    }
}