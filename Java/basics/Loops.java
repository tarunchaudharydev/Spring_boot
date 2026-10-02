// loop is a programming construct that allows you to repeat a block of code multiple times. In Java, there are several types of loops, including for loops, while loops, and do-while loops.

// gitaccount:- https://github.com/standardgalactic

/*
 syntax of for loop:
    for(initialization; condition; increment/decrement){
        // block of code to be executed
    }

 syntax of while loop:
    while(boolean condition){
        // block of code to be executed
    }

 syntax of do-while loop:
    do{
        // block of code to be executed
    } while(boolean condition);
 */

import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        
        // userInput();
        table(userInput());


    }

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range = input.nextInt();
        return range;
    }

    public static void table(int range){
        for(int i = 1; i<= range; i++){
            System.out.println("Table of "+ i);
            for(int j = 1; j<=10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
} 
  