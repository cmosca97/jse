package com.example.jse.cla;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String args[]) {

        String s = "Hello, This is JavaTpoint.";
        // Create scanner Object and pass string in it
        Scanner scan = new Scanner(s);
        // Check if the scanner has a token
        System.out.println("Boolean Result: " + scan.hasNext());
        // Print the string
        System.out.println("String: " + scan.nextLine());
        scan.close(); // close the scanner so it doesn't leak
        System.out.println("--------Enter Your Details-------- ");

        Scanner in = new Scanner(System.in); // Reading from System.in
        System.out.print("Please enter your name: "); // PROMPT
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: "); // PROMPT
        int i = in.nextInt(); // Scans the next token of the input as an integer
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: "); // PROMPT
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        // once finished
        in.close(); // close the scanner so it doesn't leak
    }
}
