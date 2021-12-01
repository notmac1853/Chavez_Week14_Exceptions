/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marco_week14_exceptions;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

/**
 *
 * @author Marco
 */
public class TestData {
    public static void main(String[] args) throws IOException{
        try{
        final int MAX = 10;
        int value;
        
        String fileName = "test.txt";
        PrintWriter outFile = new PrintWriter(fileName);
        Random rand = new Random();
        
        for (int line=1; line <= MAX; line++){
            for (int num=1; num <= MAX; num++){
                value = rand.nextInt(90) + 10;
                outFile.print(value + "   ");
            }
            outFile.println();
        }
        
        outFile.close();
        System.out.println("Output file has been created: " + fileName);
        }
        catch(FileNotFoundException e){
            System.err.print("File not found");
        }
        catch(IOException e){
            System.err.print("There is an error writing to this file");
        }
        catch(Exception e){
            System.err.print("There is an error writing to this file");
        }finally{
            
        }
    }
}

