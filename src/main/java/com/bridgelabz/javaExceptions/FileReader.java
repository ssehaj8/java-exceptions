package com.bridgelabz.javaExceptions;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;



public class FileReader {
    public static void main(String[] args){
        String sourcefile="C:/Users/sehajpreet/Desktop/bridgelabz-workspace/java-exceptions/src/main/java/com/bridgelabz/javaExceptions/input.txt";
       try{
           BufferedReader reader= new BufferedReader(new java.io.FileReader(sourcefile));
           String line;
           while((line=reader.readLine())!= null){
               System.out.println(line);
           }
       }
       catch (IOException e){
           System.out.println("File not found");
       }
    }
}
/*
Hey, I am Sehaj!
 */