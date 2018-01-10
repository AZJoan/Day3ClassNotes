package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        System.out.println("Welcome, enter a number:");

        Scanner sc = new Scanner(System.in);
        String inputFromUser;
        inputFromUser = sc.nextLine();

        int convertedNumber = Integer.parseInt(inputFromUser);

        System.out.println("line 18: " + convertedNumber);
        convertedNumber = convertedNumber + 5;
        System.out.println("line 20: " + convertedNumber);

        System.out.println("Here is what you entered: " + inputFromUser);

//        int scottsNumber = 12345;
//        String scottsStringNumber = "12345";

//        scottsStringNumber = scottsStringNumber + 5;
//        scottsNumber = scottsNumber +5;
////
//        System.out.println("number: " + scottsNumber);
//        System.out.println("string: " + scottsStringNumber);
//        System.out.println("here is what you entered:" + inputFromUser);

        // int salary = 100;
        //
        //
        // Integer class with methods but never made into objects

    }
}
