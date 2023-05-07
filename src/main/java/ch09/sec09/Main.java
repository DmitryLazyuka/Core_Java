package ch09.sec09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("Test.txt");
        String date = LocalDateTime.now().toString();
        if (Files.exists(path)) {
            Files.writeString(path, date, StandardOpenOption.APPEND);
        } else {
            Files.writeString(path, date);
        }
    }
}