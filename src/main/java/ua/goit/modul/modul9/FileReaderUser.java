package ua.goit.modul.modul9;

import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FileReaderUser {

    private static String path;

    public static void main(String[] args) throws IOException {

        FileDialog();
        System.out.println("Выбранный файл: " + path); //user.json
        List<Person> objectList = new ArrayList<>();
        readFile();



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

    private static void readFile() throws IOException {
        List<Object> userListObject = Collections.singletonList(Files.readAllLines(Paths.get(path)));

        System.out.println(userListObject);
        String jsonStr = new Gson().toJson(userListObject);
        System.out.println(jsonStr);
    }
    private static void write(){

    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}