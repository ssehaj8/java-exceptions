package com.bridgelabz.javaExceptions;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Enter the no of elements: ");
            int size= sc. nextInt();

            int[] arr = new int[size];
            System.out.println("Enter "+ size+" numbers: ");
            for(int i=0; i<size; i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("Enter index to retrieve the number: ");
            int index= sc.nextInt();

            System.out.println("Value at index "+ index+ " "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
}
/*
Enter the no of elements:
4
Enter 4 numbers:
5
7
8
9
Enter index to retrieve the number:
8
Invalid Index

Enter the no of elements:
4
Enter 4 numbers:
5
6
7
8
Enter index to retrieve the number:
2
Value at index 2 7
 */