package org.example;

import java.util.Scanner;

public class CommonIO {
    public static String input(String prompt){ // just a cin.get/input() function.
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}
