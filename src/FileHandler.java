import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileHandler{
    public static void main(String[] args) {
        /* 
        File newFile = new File("newFile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("newFile.txt");
            writer.write("Hello World!!!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }        


        try {
            File myFile = new File("newFile.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(newFile.exists()) {
            System.out.println("File name: " + newFile.getName());
            System.out.println("Absolute path: " + newFile.getAbsolutePath());
            System.out.println("Writeable: " + newFile.canWrite());
            System.out.println("Readable: : " + newFile.canRead());
            System.out.println("File size in bytes: : " + newFile.length());
        } else {
            System.out.println("The file does not exist");
        }         */


        // 只有空的文件夾才可以被刪除
        File beDelFile = new File("newFolder/beDelFile.txt"); // Delete file
        if (beDelFile.delete()) {
            System.out.println("Deleted file: " + beDelFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        File newFolder = new File("./newFolder"); // Delete folder
        if (newFolder.delete()) {
            System.out.println("Delete folder: " + newFolder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }

    }
}