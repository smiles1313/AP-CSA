/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milessophiaguessinggame;

/**
 *
 * @author s.miles1313
 */
import java.lang.Math;
import java.util.Scanner;
public class MilesSophiaGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rounds = 1;
        int wins = 0;

        while (rounds < 11){
            int num = (int)(Math.random()*10)+1;
            int tries = 3;
            
            System.out.println("\nround " + rounds + ":");
            //System.out.print("For testing purposes, the computer's number is: " + num + "\nEnter a guess: \n");
            System.out.print("\nI am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.\nEnter a guess: \n");
            
            while (tries > 0){
                int guess = scan.nextInt();
            
                    if (guess != num && tries == 1){
                        tries = 0;
                        System.out.print("wrong.\n");
                        System.out.print("The correct number was " + num + "." + "\nYou have lost the game.\n");
                        System.out.print("You have won " + wins + " games out of " + rounds + " rounds.\n");
                    }
                        
                    else if (guess != num){
     
                        if (Math.abs(guess-num) >= 3)
                            System.out.println("cold");
                        else if (Math.abs(guess-num) == 2)
                            System.out.println("warm");
                        else
                            System.out.println("hot");
                
                        tries--;
                
                    }
                    
                    else{
                        System.out.print("RIGHT! \nYou have won the game.\n");
                        tries = 0;
                        wins++;
                        System.out.print("You have won " + wins + " games out of " + rounds + " rounds.\n");
                    }  
                }
            
            rounds++;
        }
        
        if (wins == 10)
            System.out.print("Your rating: hacker.");
        else if (wins == 9)
            System.out.print("Your rating: professional.");
        else if (wins == 8)
            System.out.print("Your rating: advanced.");
        else
            System.out.print("Your rating: amateur.");
    }
    
}

/*------------------------------------------------------------------------
TESTING 
round 1:
For testing purposes, the computer's number is: 6
Enter a guess: 
6                        //1ST GUESS RIGHT TEST
RIGHT! 
You have won the game.
You have won 1 games out of 1 rounds.

round 2:
For testing purposes, the computer's number is: 10
Enter a guess: 
1                        //3RD GUESS RIGHT TEST
cold
7
cold
10
RIGHT! 
You have won the game.
You have won 2 games out of 2 rounds.

round 3:
For testing purposes, the computer's number is: 10
Enter a guess: 
8                        //3RD GUESS RIGHT TEST
warm
9
hot
10
RIGHT! 
You have won the game.
You have won 3 games out of 3 rounds.

round 4:
For testing purposes, the computer's number is: 10
Enter a guess: 
4                        //ALL 3 GUESSES WRONG TEST
cold
2
cold
7
wrong.
The correct number was 10.
You have lost the game.
You have won 3 games out of 4 rounds.

round 5:
For testing purposes, the computer's number is: 1
Enter a guess: 
7                        //ALL 3 GUESSES WRONG TEST
cold
9
cold
4
wrong.
The correct number was 1.
You have lost the game.
You have won 3 games out of 5 rounds.

round 6:
For testing purposes, the computer's number is: 7
Enter a guess: 
6                        //2ND GUESS RIGHT TEST
hot
7
RIGHT! 
You have won the game.
You have won 4 games out of 6 rounds.

round 7:
For testing purposes, the computer's number is: 9
Enter a guess: 
2                        //3RD GUESS RIGHT TEST
cold
8
hot
9
RIGHT! 
You have won the game.
You have won 5 games out of 7 rounds.

round 8:
For testing purposes, the computer's number is: 7
Enter a guess: 
7                        //1ST GUESS RIGHT TEST
RIGHT! 
You have won the game.
You have won 6 games out of 8 rounds.

round 9:
For testing purposes, the computer's number is: 7
Enter a guess: 
3                        //2ND GUESS RIGHT TEST
cold
7
RIGHT! 
You have won the game.
You have won 7 games out of 9 rounds.

round 10:
For testing purposes, the computer's number is: 6
Enter a guess: 
5                        //3RD GUESS RIGHT TEST
hot
8
warm
6
RIGHT! 
You have won the game.
You have won 8 games out of 10 rounds.
Your rating: advanced.
*/
