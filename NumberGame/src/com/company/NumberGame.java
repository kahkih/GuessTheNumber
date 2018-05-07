package com.company;

import java.util.Scanner;
//Java needs a utility file to realtime receive data input from the user. There are other files too.

public class NumberGame {

    public static void main(String [] args) {
        int randomNumber = (int) (Math.random()*100) +1;
        //created a randomizer for numbers between 1 and 100.
        
        boolean hasWon = false;
        //Created a boolean status to check if the user has won.
        
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        //set of instructions that wil be displayed in the beginning of the code.
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i --) {
            //Created a for loop with i as a variable which can be adjusted to increase or decrease difficulty. Loop stops when 0 is reached.
            
            System.out.println("You have " + i + " guess(es) left. Choose again: ");
            // Shows the initial amount of guesses and the amount that remains after each wrong guess.
            
            int guess = scanner.nextInt();
            //Variable that checks the user input.

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            }
            //Prints out line if the randomNumber is smaller than the guess.

            else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + ".");
            }
            //Prints out line if the randomNumber is greater than the guess.

            else {
                hasWon = true;
                break;
                //If it is not greater or smaller than the guessed number is correct and it will jump to the next line of code.
            }
        }
        if (hasWon) {
            System.out.println("Correct! You win!");
            //prints out when the user has guessed correctly. 
        } else {
                System.out.println("Wrong! You lost! :( ");
                System.out.println("The answer was " + randomNumber + ".");
            }
        //prints out what the randomNuber was when the user has used all the guesses.
        }
    }

//Does this even work? (first try out with git)
