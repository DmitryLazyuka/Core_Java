package ch09.sec09.exercise08;

import java.io.*;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        String sourceDirectory = "D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch09\\sec09\\exercise08\\Directory 1";
        String zipFilePath = "D:\\IdeaProjects\\Invoices\\test\\src\\main\\java\\ch09\\sec09\\exercise08\\zipfile.zip";

        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            File sourceFolder = new File(sourceDirectory);
            addFolderToZip(sourceFolder, sourceFolder.getName(), zos);
            System.out.println("Successfully created ZIP file: " + zipFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addFolderToZip(File folder, String folderName, ZipOutputStream zos) throws IOException {

        zos.putNextEntry(new ZipEntry(folderName + "/"));
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isDirectory()) {
                addFolderToZip(file, folderName + "/" + file.getName(), zos);
            } else {
                try (FileInputStream fis = new FileInputStream(file)) {
                    zos.putNextEntry(new ZipEntry(folderName + "/" + file.getName()));
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);
                    zos.write(buffer);
                    zos.closeEntry();
                }
            }
        }
    }
}
