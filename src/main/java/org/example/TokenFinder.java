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
}
