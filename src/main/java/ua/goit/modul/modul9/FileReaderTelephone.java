package ua.goit.modul.modul9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderTelephone {
    public static void main(String[] args) throws IOException {
        Path get = Paths.get( "file.txt" );
        List<String> result = Files.readAllLines(get);

        System.out.println(result);
    }

}
