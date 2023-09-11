package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static String input(String prompt){ // just a cin.get/input() function.
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
    public static void main(String[] args) {

        //String fileName = input("which file will be used? -> ");
        FileContent target = new FileContent("code.txt");


        //TokenSet stores and indexes tokens, Token reads characters one-by-one into tokens
        ArrayList<String> tokenSet = new ArrayList<String>();
        StringBuilder token = new StringBuilder();

        for(int i = 0; i < target.RawText().length(); i++){

            char parseChar = target.RawText().charAt(i);

            if(parseChar != ' ' && parseChar != ';') //building a string out of the token.
                token.append(parseChar);

            else{ //We find a space, and thus we pass the content of StringBuilder into the ArrayList.
                tokenSet.add(tokenSet.size(), token.toString());
                token.delete(0, token.toString().length());
            }
        }

        //This is the ASCII table

        /* for(int i = 0; i < 128; i++){
            System.out.println(i + " : " + (char)i);
        } */

        //

        for(int i = 0; i < tokenSet.size(); i++){
            char startChar = tokenSet.get(i).charAt(0);
            Integer x = (int)startChar;
            if((x > 64 && x < 91) || (x > 96 && x < 123))
                System.out.println("var name");
            else
                System.out.println("not var name");
        }
    }
}