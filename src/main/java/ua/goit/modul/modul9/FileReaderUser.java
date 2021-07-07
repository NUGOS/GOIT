package ua.goit.modul.modul9;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class FileReaderUser {

    private static final String absoluteJsonPath = "src/main/resources/JSON.json";
    private static String path;


    public static void main(String[] args) {

        File fileJSON = new File(absoluteJsonPath);
        fileDialog();

        List<Person> people = new LinkedList<>();

        readFiles(people);
        writeToJson(fileJSON, people);
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

    private static void writeToJson(File fileJSON, List<Person> people) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileJSON))) {
            Gson gson = new GsonBuilder().setPrettyPrinting()
                                         .create();
            String json = gson.toJson(people);
            bufferedWriter.write(json);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void readFiles(List<Person> people) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String dataFile = bufferedReader.readLine();

            while (dataFile != null) {
                String[] column = dataFile.split(" ");
                if (!column[0].equals("name") && !column[1].equals("age")) {
                    people.add(new Person(column[0], Integer.parseInt(column[1])));
                }
                dataFile = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}


