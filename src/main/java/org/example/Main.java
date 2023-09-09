package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        //****************************************************************

        String filePath = "code.txt";

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null)
                text.append(line).append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileText = text.toString();

        //*****************************************************************************

        //TokenSet stores and indexes tokens, Token reads characters one-by-one into tokens
        ArrayList<String> TokenSet = new ArrayList<String>();
        StringBuilder Token = new StringBuilder();

        for(int i = 0; i < fileText.length(); i++){
            if(fileText.charAt(i) != ' ' && fileText.charAt(i) != ';') //building a string out of the token.
                Token.append(fileText.charAt(i));
            else{ //We find a space, and thus we pass the content of StringBuilder into the ArrayList.
                TokenSet.add(TokenSet.size(), Token.toString());
                Token.delete(0, Token.toString().length());
            }
        }

        //This is the ASCII table
        for(int i = 0; i < 128; i++){
            System.out.println(i + " : " + (char)i);
        }

        // (x < 65 || (x > 90 && x < 97) || x > 122)

        for(int i = 0; i < TokenSet.size(); i++){
            char startChar = TokenSet.get(i).charAt(0);
            Integer x = (int)startChar;
        }
    }
}