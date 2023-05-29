package ss16_io_binary_file_serialization.exercise.copy_binary_file;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter source file: ");
//        src/ss16_io_binary_file_serialization/exercise/copy_binary_file/data.txt
        String sourcePath = scanner.nextLine();
        System.out.printf("Enter destination file: ");
//        src/ss16_io_binary_file_serialization/exercise/copy_binary_file/dataCopy.txt
        String destPath = scanner.nextLine();

        try {
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
               throw new FileNotFoundException();
            }
            File destFile = new File(destPath);
            if (destFile.exists()) {
                throw new RuntimeException();
            }
//            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.printf("Copy Completed");
            System.out.println(". The available bytes in file is: " + destFile.length());
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File source do not exist. Error");
        } catch (RuntimeException runtimeException) {
            System.out.println("File destination had existed. Error");
        } catch (IOException e) {
            System.out.printf("Can't copy that file ");
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}

