package ua.goit.modul.modul9;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FileReaderCountSort {
    private static String path;

    public static void main(String[] args) {
        fileDialog();
        read();
    }

    private static void fileDialog() {
        java.awt.FileDialog dialog = new FileDialog((Frame) null);
        dialog.setVisible(true);
        String directory = dialog.getDirectory();
        String filename = dialog.getFile();
        dialog.dispose();
        if (directory == null || filename == null) {
            System.out.println("Файл не выбран!");
            return;
        }
        path = directory + filename;
    }

    private static void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            StringBuilder text = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                text.append(line)
                    .append(" ");
                line = reader.readLine();
            }
            String[] words = text.toString()
                                 .split(" ");

            Map<String, Integer> uniqueWords = new HashMap<>();
            for (String word : words) {
                Integer counter = uniqueWords.get(word);
                if (counter == null) {
                    counter = 0;
                }
                uniqueWords.put(word, counter + 1);
            }

            uniqueWords.keySet()
                       .stream()
                       .sorted(Comparator.comparing(uniqueWords::get, Comparator.reverseOrder()))
                       .forEach(word -> System.out.println(word + " - " + uniqueWords.get(word)));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
