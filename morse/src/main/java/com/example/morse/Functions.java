package com.example.morse;

import java.io.FileWriter;
import java.io.IOException;

public class Functions {
    static char [] engSymbols = new char[] {'A','B','C','D','E','F','G',
            'H','I','J','K','L','M','N','O','P','Q',
            'R','S','T','U','V','W','X','Y','Z','1','2',
            '2','4','5','6','7','8','9',' '};
    static String [] morzeSymbols = new String[] {".-", "-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.","---",
            ".--.", "--.-",".-.","...","-","..-","...-",
            ".--","-..-","-.--","--..",".----","..---","...--",
            "....-","....-",".....","-....","--...","---..",
            "----.","-----"," "};

    public static void saveToLogFile(String string, String path) {
        try (FileWriter writer = new FileWriter(path, true)){
            writer.write(string);
            writer.write("\n");
        } catch (IOException i) {
            System.out.println("some error in log file");
        }
    }

    public static String fromEngToMorze (String s) {
        String result = "";
        char [] input = s.toUpperCase().toCharArray();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < engSymbols.length; j++) {
                if (engSymbols[j] == input[i]) {
                    result = result + morzeSymbols[j] +  " ";
                }
            }
        }
        return result;
    }
    public static String fromMorzeToEng (String s) {
        String result = "";
        String [] input = s.split(" ");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < morzeSymbols.length; j++) {
                if (input[i].equalsIgnoreCase(morzeSymbols[j])){
                    result = result + engSymbols[j];
                }
            }
        }
        return result;
    }
}
