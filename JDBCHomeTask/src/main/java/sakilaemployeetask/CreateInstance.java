package sakilaemployeetask;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
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
        Connection connection= DriverManager.getConnection(propertiesFile.getProperty("url"),propertiesFile.getProperty("username"),propertiesFile.getProperty("password"));
        return connection;
    }

    public void createTable(Connection connection){
        try(Statement statement=connection.createStatement();) {
            String query="create table employe_data (emp_id int unique,emp_name varchar(45),emp_designation varchar(45) not null, emp_sal int not null,emp_loc varchar(45) default \"India\")";
            statement.executeUpdate(query);

            statement.executeUpdate("insert into employe_data(emp_id,emp_name,emp_designation,emp_sal) values(5,'ram','Associate',35000)");
            ResultSet resultSet=statement.executeQuery("select * from employe_data");
            resultSet.next();
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addPrimaryKeyAndAddNewColumn(Connection connection){
        try(Statement statement=connection.createStatement();){
            String addPrimaryKey="alter table employe_data add primary key(emp_id)";
            statement.executeUpdate(addPrimaryKey);
            String addNewCol="alter table employe_data add emp_dept varchar(45);";
            statement.executeUpdate(addNewCol);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void insertData(Connection connection){
        try(Statement statement=connection.createStatement();) {
            String emp1="insert into employe_data(emp_id,emp_name,emp_designation,emp_sal,emp_dept) values(2,'seeta','Assistant',30000,'CSE')";
            statement.executeUpdate(emp1);

            String emp2="insert into employe_data(emp_id,emp_name,emp_designation,emp_sal,emp_dept) values(3,'ramana','Professor',50000,'ECE')";
            statement.executeUpdate(emp2);

            String emp3="insert into employe_data(emp_id,emp_name,emp_designation,emp_sal,emp_dept) values(21,'viswanath','HOD',75000,'CSD')";
            statement.executeUpdate(emp3);

            String emp4="insert into employe_data(emp_id,emp_name,emp_designation,emp_sal,emp_dept) values(15,'krish','Professor',100000,'CSE')";
            statement.executeUpdate(emp4);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void printEmpData(Connection connection){
        try(Statement statement=connection.createStatement()){
            String deleteRow="delete from employe_data where emp_id=5";
            statement.executeUpdate(deleteRow);

            String resultQuery="select * from employe_data";
            ResultSet resultSet=statement.executeQuery(resultQuery);

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
