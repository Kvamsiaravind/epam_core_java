package PropertiesClass;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesSolution {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("Username", "Kuruva_Vamsi");
        p.setProperty("email", "Kvamsiaravind@gmail.com");
        FileWriter fileWriter = new FileWriter("info.properties");
        System.out.println("Getting properties of a username :" + p.getProperty("Username"));
        System.out.println("Getting properties of a email :" + p.getProperty("email"));
        System.out.println(p);
    }
}
