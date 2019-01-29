package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        countThemLines(scanner.nextLine());

    }
    public static void countThemLines (String fileName){
        try{
            Path pathToFileName = Paths.get(fileName);
            List<String> file = Files.readAllLines(pathToFileName);
            System.out.print(file.size());
        }catch (IOException ex){
            System.err.println(0);
        }

    }
}
