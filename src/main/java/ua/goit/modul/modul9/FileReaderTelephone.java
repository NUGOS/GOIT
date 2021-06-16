package ua.goit.modul.modul9;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileReaderTelephone {
    private static final String VALIDATE_ONE = "\\d{3}-\\d{3}-\\d{4}";
    private static final String VALIDATE_TWO = "\\(\\d{3}\\) \\d{3}-\\d{4}";
    private static String path;

    public static void main(String[] args) throws IOException {

        FileDialog();
        System.out.println("Выбранный файл: " + path);
        read();
    }

    private static String FileDialog() {
        java.awt.FileDialog dialog = new FileDialog((Frame) null);
        dialog.setVisible(true);
        String directory = dialog.getDirectory();
        String filename = dialog.getFile();
        dialog.dispose();
        if (directory == null || filename == null) {
            System.out.println("Файл не выбран!");
            return directory;
        }
        return path = directory + filename;

    }

    private static void read() throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String numbers = bufferedReader.readLine();
            while (numbers != null) {
                if (isCorrectlyNumber(numbers)) {
                    System.out.println(numbers);
                }
                numbers = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isCorrectlyNumber(String number) {
        return Pattern.matches(VALIDATE_ONE, number) || Pattern.matches(VALIDATE_TWO, number);
    }
}
