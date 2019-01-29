package com.company;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

import java.util.List;

public class FileCopier {
    public static void main(String[] args) {
        String firstFileName = "CopiedFrom";
        String secondFileName = "CopiedTo";
        System.out.println(Copied(firstFileName,secondFileName));
    }

    public static boolean Copied (String oldFile , String newFile){

        boolean answer;
        try {
            Path pathToOldFile = Paths.get(oldFile);
            List<String> oldFileContents = Files.readAllLines(pathToOldFile);
            Path pathToNewFile = Paths.get(newFile);
            List<String> newFileContents = oldFileContents;
            Files.write(pathToNewFile,newFileContents);
            answer=true;
        }catch (IOException ex){
            answer=false;
        }
        return answer;
    }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful