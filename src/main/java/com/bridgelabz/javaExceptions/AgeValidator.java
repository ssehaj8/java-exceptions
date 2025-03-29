package com.bridgelabz.javaExceptions;

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age must be 18 or above");
    }
}

public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
/*
Enter your age: 20
Access granted!

Enter your age: 8
Age must be 18 or above

 */

