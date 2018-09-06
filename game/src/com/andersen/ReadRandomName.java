package com.andersen;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadRandomName {
    List<String> lines = null;
    String file = "D:\\Work\\AutomationMaster\\Automation-courses\\game\\src\\name.txt";

    public String readNameFromFile() {
        try {
            lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("File 'Names of Character' not found");
        }
        int randomIndexStr = getRandomNumber(0, lines.size());
        return lines.get(randomIndexStr);
    }

    private int getRandomNumber (int min, int max) {
        return min + (int) (Math.random() * ((max - min)));
    }

}
