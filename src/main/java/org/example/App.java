package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "How many euros are you exchanging? " );
        int euros = input.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        System.out.println(euros + " euros at an exchange rate of " + rate + " is");
        double usd = euros * rate;
        double roundUSD = Math.round(usd * 100.0)/100.0;
        System.out.print(roundUSD + " U.S. dollars.");
    }
}
