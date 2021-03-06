import java.util.Scanner;
import java.util.Random;

//Big or Small Game
//this is a test

public class Dice {
    
    public static void main(String[] args) { 
        //declearing items
        Scanner scanner = new Scanner(System.in);
        int account = 100;
        int bets; 
        String choice;
        Dices game = new Dices();

        //main game running
        while (true) {
            System.out.println("Welcome to Throw dice \n Ready? \n Let's Go!!!");

            //Betting
            System.out.print("Places your Bets: ");// placing of Bets
            bets = scanner.nextInt();
            System.out.print("Big or Small: ");
            game.input = scanner.next().toLowerCase();

            // call the game
            game.calculationSum();
            //big wins or small win (How to compare the results of the game)

            
            //choice for the player to
            System.out.println("Would you like to contiune? (Yes or No)");
            choice =  scanner.next().toLowerCase();

            if (choice.equals("no")){
                System.out.println("Thank you and have a nice day");
                System.exit(0);}

            else {
                continue;}
        }
    }
}

    class Dices {
        String input;

        void calculationSum () {
            int totalSum;
            Random dice1 = new Random(); // inorder for the value of the dice to be different in the next game it has to be voided back to 0 before a new game
            Random dice2 = new Random();
            Random dice3 = new Random();
            int x = 1+dice1.nextInt(6);
            int y = 1+dice2.nextInt(6);
            int z = 1+dice3.nextInt(6); 
            System.out.println(x + " ");
            System.out.println(y + " ");
            System.out.println(z + " ");

            totalSum = x + y + z;

            if(input.equals("big") && totalSum >= 10){
                System.out.println("The Number is "+ totalSum + " Big.");
                System.out.println("You Won!");    
            }
            
            else if (input.equals("small") && totalSum <= 9){
                System.out.println("The Number is "+ totalSum + " Small");
                System.out.println("You Won!");
            }
            
            else if(input.equals("small") && totalSum >= 10){
                System.out.println("The Number is "+ totalSum + " Big");
                System.out.println("You Lost!");
            }

            else if(input.equals("big") && totalSum <= 9){
                System.out.println("The Number is "+ totalSum + " small");
                System.out.println("You Lost!");
            }

        }

    }