package ch09.sec09.exercise11;

import java.nio.file.Path;

/*Using regular expressions, extract the directory path names (as an array of
strings), the file name, and the file extension from an absolute or relative
path such as /home/cay/myfile.txt*/
public class Main {
    public static void main(String[] args) {
        Path path = Path.of("ch09\\sec09\\exercise04\\war_and_peace.txt");
        System.out.println("Relative Path");
        print(path.toString().split("\\\\|\\."));
        System.out.println("Absolute Path");
        print(path.toAbsolutePath().toString().split("\\\\|\\."));
    }
    public static void print(String[] array){
        System.out.print("Categories: ");
        for (int i = 0; i < array.length-3; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nFile name: " + array[array.length-2]);
        System.out.println("File extension: " + array[array.length-1]);
    }
}
