package TryWithResourcePractice;

import java.io.FileOutputStream;

public class TryWithResource {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Vamsi_Kuruva/RD_Training/rd_join_vamsi/JavaConcepts/file1.txt");) {
            String message = "Welcome to try-with-resource ..!!";
            byte arr[] = message.getBytes();
            fileOutputStream.write(arr);
            System.out.println("Data written into file.");
            String s = new String(arr);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
