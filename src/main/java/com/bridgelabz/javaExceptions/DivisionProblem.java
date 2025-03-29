package com.bridgelabz.javaExceptions;

import java.util.*;
import java.io.*;

public class DivisionProblem {
    public static void main(String[] Args){
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Enter the First number: ");
            int num1= sc.nextInt();

            System.out.println("Enter the Second number:  ");
            int num2= sc.nextInt();

            int result= num1/num2;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e){
                System.out.println("Error: Division by Zero is not allowed");
            }
        catch (InputMismatchException e){
            System.out .println("Error: The value entered is non-numeric");
        }
    }
}
/*
Enter the First number:
8
Enter the Second number:
2
Result: 4
 */