package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileContent {
    ArrayList<String> text = new ArrayList<String>();
    FileContent(String filePath){
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null)
                text.add(line);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public String RawText(){
        StringBuilder rawText = new StringBuilder();
        for (int i = 0; i < text.size(); i++){
            rawText.append(text.get(i));
            rawText.append('\n');
        }
        return rawText.toString();
    }
}
