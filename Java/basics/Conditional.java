// Syntax of conditional statements

 /*
 syntax of if statement:
    if(boolean condition){
        if the condition is true, then execute this block of code
    } else{
        if the condition is false, then execute this block of code
    }
 */

/*

    syntax of if-else statement:
        if(boolean condition){
            if the condition is true, then execute this block of code
        } else if(boolean condition){
            if the first condition is false and this condition is true, then execute this block of code
        } else{
            if all the above conditions are false, then execute this block of code
        }

 */

public class Conditional{
    public static void main(String[] args){
        int salary = 9999999;
        if(salary > 10000){
            salary = salary +50000;
        } else{
            salary = salary + 10000;
        }
        System.out.println(salary);
    }
}