package worldschematask;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateInstance {
    private CreateInstance() {
    }

    private static CreateInstance createInstance=null;
    public static CreateInstance getInstance(){
        if(createInstance==null){
            createInstance=new CreateInstance();
        }
        return createInstance;
    }

    public Connection makeConnection() throws ClassNotFoundException, IOException, SQLException {
        FileReader fileReader=new FileReader("database.properties");
        Properties propertiesFile=new Properties();
        propertiesFile.load(fileReader);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(propertiesFile.getProperty("urlforworld"),propertiesFile.getProperty("username"),propertiesFile.getProperty("password"));
        return connection;
    }
}
