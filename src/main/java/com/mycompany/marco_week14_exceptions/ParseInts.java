/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.marco_week14_exceptions;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Marco
 */
public class ParseInts {
    public static void main(String[] args)throws IOException{ 
        int val, sum=0; 
        Scanner scan = new Scanner(System.in); 
        String line; 
        System.out.println("Enter a line of text"); 
        Scanner scanLine = new Scanner(scan.nextLine()); 
        
        while (scanLine.hasNext()) { 
            try {
            val = Integer.parseInt(scanLine.next()); 
            sum += val; 
            }
            catch (NumberFormatException e){
            }   
        } 
        System.out.println("The sum of the integers on this line is " + sum);
        
        
        
    }   
}
