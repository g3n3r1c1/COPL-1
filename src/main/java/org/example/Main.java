package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        FileContent target = new FileContent(CommonIO.input("which file will be used? -> "));
        ArrayList<String> newSet = TokenFinder.tokenSet(target);
        for (int i = 0; i < newSet.size(); i++){
            System.out.print(newSet.get(i));
            TokenFinder.determineToken(newSet.get(i));
        }
    }
}