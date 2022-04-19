package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x = GetInput("Enter a number: ");

        String y = GetInput("Enter another number: ");
        String z = x + y;
        System.out.println(x + " " + y);
        System.out.println("total: " + z);
        System.out.println("reversed: " + y +" " + x);
    }

    public static String GetInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
