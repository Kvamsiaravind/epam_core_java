package jdbcadditionaltask;
import java.sql.*;
public class SecondHighest {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/sys";
        String username="root";
        String password="Vamsi@06";
        String query="Select * from Employee_table order by salary DESC limit 1,1;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection(url,username,password);
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(query);
        resultSet.next();
        System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
        statement.close();
        connection.close();
    }
}