package com.bridgelabz.javaExceptions;
import java .util.*;
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "input.txt"; // File path
        String sourcefile="C:\\Users\\sehajpreet\\Desktop\\bridgelabz-workspace\\java-exceptions\\src\\main\\java\\com\\bridgelabz\\javaExceptions\\input.txt";

        try (BufferedReader reader= new BufferedReader(new java.io.FileReader(sourcefile))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

