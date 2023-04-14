package ch03.sec03;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(subdirectories("C:\\Users\\User\\Desktop\\")));
        System.out.println(Arrays.toString(filesWithExtension("C:\\Users\\User\\Desktop\\",".pdf")));

        File[] allFiles = new File("C:\\Users\\User\\Desktop\\").listFiles();
        File[] sorted = sort(allFiles);
        for (File file: sorted
             ) {
            System.out.println(file);
        }
    }

    public static File[] subdirectories(String directory) {
        File file = new File(directory);
        return file.listFiles(File::isDirectory);
    }

    public static File[] filesWithExtension(String directory, String extension) {
        return Arrays.stream(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .filter(x -> x.toString().endsWith(extension))
                .toArray(File[]::new);
    }

    public static File[] sort(File[] files){
        return Arrays.stream(files)
                .sorted(Comparator.comparing(File::getAbsolutePath))
                .sorted(Comparator.comparing(File::isDirectory))
                .toArray(File[]::new);
    }
}