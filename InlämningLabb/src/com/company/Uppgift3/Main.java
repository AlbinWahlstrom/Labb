package com.company.Uppgift3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String regex = "[a-z][aeiouy][a-z](?!\1)";

        List <String> wordList = new  ArrayList <String>(
                List.of("hello",
                        "greetings",
                        "goodbye",
                        "fArEwell",
                        "hey",
                        "eee",
                        "nfft",
                        "kltmbgfrt",
                        "eh")
        );

        for (String words : wordList) {
            Pattern pattern = Pattern.compile(regex) ;
            Matcher matcher = pattern.matcher(words);
            boolean matchFound = matcher.find();
            if (matchFound){
                System.out.println(words);
                System.out.println("");
            }

        }

    }

}
