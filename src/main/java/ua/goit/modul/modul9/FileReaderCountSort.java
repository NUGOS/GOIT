package ua.goit.modul.modul9;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.nio.file.Paths.*;

public class FileReaderCountSort {

    private static final String absoluteJsonPath = "src/main/resources/JSON.json";
    private static String path;


    public static void main(String[] args) {
        fileDialog();
        readFiles();
    }

    private static String fileDialog() {
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

    private static void readFiles() {

        try {
            List<String> stringListWorlds = Files.readAllLines(get(path));

            for (String i:stringListWorlds){
                System.out.println(Arrays.toString(new List[]{stringListWorlds}));
            }
            String [] buff = new String[0];
            String[] array = stringListWorlds.toArray(buff);
            System.out.println(stringListWorlds.size());
            for (String i:array) {
                System.out.println(Arrays.toString(array));
            }
            System.out.println(array.length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
