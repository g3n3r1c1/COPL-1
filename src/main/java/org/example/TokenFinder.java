package org.example;

import java.util.ArrayList;

public class TokenFinder {
    public static ArrayList<String> tokenSet(FileContent target) {
        //TokenSet stores and indexes tokens, Token reads characters one-by-one into tokens
        ArrayList<String> tokenSet = new ArrayList<String>();
        StringBuilder token = new StringBuilder();

        for (int i = 0; i < target.RawText().length(); i++) {

            char parseChar = target.RawText().charAt(i);

            if (parseChar != ' ' && parseChar != ';') //building a string out of the token.
                token.append(parseChar);

            else { //We find a space, and thus we pass the content of StringBuilder into the ArrayList.
                tokenSet.add(tokenSet.size(), token.toString());
                token.delete(0, token.toString().length());
            }
        }
        return tokenSet;
    }

    public static void determineToken(String Token){
        char x = Token.charAt(0);
        System.out.print(" : ");
            if((x > 64 && x < 91) || (x > 96 && x < 123)) {
                System.out.println("var name");
            }
            else if(x == ':'){
                if(Token.equals("::=")){
                    System.out.println("variable definition");
                }
                else{
                    System.out.println("invalid symbol.");
                }
            }
            else if(x >= 48 || x <= 57){
                System.out.println("it's an expression");
            }
            else
                System.out.println("Not known yet.");
    }
}
