package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMyNameToFile {
    public static void main(String[] args) {
         String name = "Tamás Puskás";
        nameAdder(name);

    }
    public static List<String> nameAdder(String name){
        List<String> adder = new ArrayList();
        adder.add(name);
        Path filePath = Paths.get("my-file.txt");
        try {
            Files.write(filePath, adder);
        }catch (IOException ex){
            System.err.println("Unable to write to my-file.txt");
        }
        return adder;
    }
}
