package com.company;

import java.awt.*;
import java.text.Format;
import java.util.Scanner

public class Main {

    public static void main(String[] args) {
        double amount;
        double rupee, dollar, pound, euro, yen, ringgit;
        int choice;
        Scanner  Scanner = new Scanner(System.in);
        System.out.println("following are the choices");
        System.out.println("Enter 1:Rupee");
        System.out.println("Enter 2:Dollar");
        System.out.println("Enter 3:pound");
        System.out.println("Enter 4:Euro");
        System.out.println("Enter 5:Yen");
        System.out.println("Enter 6:Ringget");

        System.out.println("\n choose from above options");
        choice =Scanner .nextInt();
        System.out.println("Enter the amount you want to convert");
        amount = Scanner .nextFloat();
        dollar = amount / 83;
        System.out.println(amount + " Rupee = " +dollar+ " Dollar");

        pound = amount / 88;
        System.out.println(amount + " Rupee = " +pound + " Pound");

        euro = amount / 80;
        System.out.println(amount + " Rupee = " +euro + " Euro");

        yen = amount / 0.63;
        System.out.println(amount + " Rupee = " +yen + " Yen");

        ringgit = amount / 16;
        System.out.println(amount + " Rupee = "  + ringgit+ " ringgit");
    }
}

