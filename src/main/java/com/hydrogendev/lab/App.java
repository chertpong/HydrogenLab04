package com.hydrogendev.lab;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String decryptMe(String encryptedWords,int shiftNumber){
        String[] list = encryptedWords.split("");
        for(int i = 0; i< list.length; i++){
            if(!list[i].equals(" "))
                list[i] = shiftAlphabet(list[i].charAt(0),shiftNumber);
        }

        StringBuffer result = new StringBuffer();
        for (String s : list) {
            result.append(s);
        }

        return result.toString();
    }
    public String shiftAlphabet(char alphabet, int shiftNumber){
        int alphabetCode = alphabet;
//      Code of 'a' = 97
//      Shift code
        alphabetCode = (alphabetCode - 97 + shiftNumber);
//      Size of a to z = 26
        alphabetCode = alphabetCode % 26;
//      turn it to char code
        alphabetCode+=97;
//      turn it into char
        alphabet = (char) alphabetCode;
        return alphabet+"";
    }


}
