package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        FileContent target = new FileContent(CommonIO.input("which file will be used? -> "));

        TokenFinder.tokenSet(target);


//        for(int i = 0; i < tokenSet.size(); i++){
//            char startChar = tokenSet.get(i).charAt(0);
//            Integer x = (int)startChar;
//            if((x > 64 && x < 91) || (x > 96 && x < 123))
//                System.out.println("var name");
//            else
//                System.out.println("not var name");
//        }
    }
}