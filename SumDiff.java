/*Easy: Write a Java program to accept two numbers and calculate their sum and difference
using arithmetic operators. */

import java.util.Scanner;
public class SumDiff {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the a value:");
        int a = scanner.nextInt();

        System.out.println("Enter the b value:");
        int b = scanner.nextInt();

        int c = a+b;
        int d = a-b;

        System.out.println("sum = "+c);
        System.out.println("difference"+d);
    
        
    }
    
}
