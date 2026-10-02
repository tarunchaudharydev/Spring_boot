
import java.util.Scanner;

class LargestNumber{
    public static void main(String[] args){
        largestNumber(num1, num2, num3);
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
    }

    public static int largestNumber(int num1, int num2, int num3){
        int max = num1;
        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }
        return max;
    }
}