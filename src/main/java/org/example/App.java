package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 20 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        Scanner inString =  new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmt = in.nextDouble();
        System.out.print("What state do you live in? ");
        String state = inString.nextLine();
        System.out.print("What county do you live in? ");
        String county = inString.nextLine();

        double tax = 0.0;
        double addTax = 0.0;
        if(state.equals("Wisconsin")) {
            tax = 0.05;
            if(county.equals("Eau Claire")) {
                addTax = 0.005;
            } else if(county.equals("Dunn")) {
                addTax = 0.004;
            }
        } else if(state.equals("Illinois")) {
            tax = 0.08;
        }
        double taxOnTotal = tax * orderAmt;
        double total = taxOnTotal + orderAmt + addTax;
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", taxOnTotal, total);

    }
}
