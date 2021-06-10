package ua.goit.modul.modul9;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileReaderTelephone {
    private static final String VALIDATE_ONE = "\\d{3}-\\d{3}-\\d{4}";
    private static final String VALIDATE_TWO = "\\(\\d{3}\\) \\d{3}-\\d{4}";

    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = FileReaderTelephone.class.getResourceAsStream( "/file.txt" );
        String result = null;
        result = read( resourceAsStream, result );

        result.split( "  " );
        System.out.println( result );
    }

    public static String read(InputStream is, String result) {
        try (Scanner sc = new Scanner( new BufferedInputStream( is ) )) {
            StringBuilder sb = new StringBuilder();

            while (sc.hasNext()) {
                if (!isCorrectlyNumber( result )) {
                    continue;
                }
                sb.append( sc.nextLine() );
            }
            return sb.toString();

        }
    }

    private static boolean isCorrectlyNumber(CharSequence result) {
        return Pattern.matches( VALIDATE_ONE, result ) || Pattern.matches( VALIDATE_TWO, result );
    }
}
