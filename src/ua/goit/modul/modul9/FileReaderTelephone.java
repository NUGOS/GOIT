package ua.goit.modul.modul9;

import java.io.File;

public class FileReaderTelephone {
    public static void main(String[] args) {
        File file = new File("/resources/");
        System.out.println(file.exists());
        System.out.println(file.listFiles());
        System.out.println(file.getParentFile());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(file.getAbsolutePath());
    }

}
