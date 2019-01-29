package com.company;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


public class WriteALotOfLines {
    public static void main(String[] args) {
        Path pathToFile = Paths.get("LoadsOfLines.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a word to multiply: ");
        String word = scanner.nextLine();
        System.out.println("How many times would you like to copy it: ");
        int copies = scanner.nextInt();
        loadOfLines(pathToFile,word,copies);
        
    }
    public static void loadOfLines (Path fileToWriteTo , String wordToWrite , int numberOfLinesToWrite){
            List<String> file = new ArrayList<>();
        for (int i = 0; i < numberOfLinesToWrite ; i++) {
            file.add(wordToWrite);
        }
        try {
            Files.write(fileToWriteTo, file);
        } catch (IOException ex){
            System.err.println("Unable to write to LoadsOfLines.txt");
        }
    }
}
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.