package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Factorial factorial = new Factorial();

        long value;

        System.out.println("Enter the number you want to find the factorial of: ");

        Scanner scanner = new Scanner(System.in);

        value = scanner.nextInt();

        if (value >15){

            System.out.println("Invalid value. Please Insert valid value which is less than 16 : ");

            value = scanner.nextInt();
        }
        long number= factorial.factorial(value);
        System.out.println("Factorial of " + value + " is : " + number);





    }
    public long factorial(long x){
        long number = 1;
        for (int i = 1; i <=x ; i++) {
            number = number*i;
            
        }
        return number;
    }
}
