package ch09.sec09.exercise01;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/*Write a utility method for copying all of an InputStream to an
OutputStream, without using any temporary files. Provide another
solution, without a loop, using operations from the Files class, using a
temporary file.*/
public class Main {
    public static void main(String[] args) {
        InputStream is = new ByteArrayInputStream(new byte[]{1,3,2,1,4,7,8});
        OutputStream os = new ByteArrayOutputStream();
        Main.copy(is,os);
        Main.anotherCopy(is,os);
    }
    public static void copy(InputStream is, OutputStream os){
        try (is; os) {
            is.transferTo(os);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void anotherCopy(InputStream is, OutputStream os){
        try(is;os){
            Path path = Path.of("C:\\Users\\User\\Desktop");
            Files.copy(is, path, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(path,os);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}