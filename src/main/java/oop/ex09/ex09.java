/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 09 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex09;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args)
    {
        int paintFeetPerGallonRate = 350;

        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the length of the ceiling? ");
        int ceilingLength = userInputScanner.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int ceilingWidth = userInputScanner.nextInt();

        int ceilingSquareFeet = ceilingLength * ceilingWidth;

        int totalPaintGallons = ceilingSquareFeet / paintFeetPerGallonRate;
        int paintRemainder = ceilingSquareFeet % paintFeetPerGallonRate;

        if(paintRemainder != 0){
            totalPaintGallons++;
        }

        System.out.print("You will need to purchase " + totalPaintGallons + " gallons of paint to cover " + ceilingSquareFeet + " square feet.");
    }
}
