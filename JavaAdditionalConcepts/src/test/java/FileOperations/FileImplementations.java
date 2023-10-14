package FileOperations;

import java.io.*;
import java.nio.file.Paths;

public class FileImplementations {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter pw = new PrintWriter(file);
        pw.println("this is content in file.");
        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
        br.close();
        File file2 = new File("test.txt");
        if (file2.delete())
            System.out.println("File deleted successfully.");
        else
            System.out.println("Failed to delete this file.");
    }
}
