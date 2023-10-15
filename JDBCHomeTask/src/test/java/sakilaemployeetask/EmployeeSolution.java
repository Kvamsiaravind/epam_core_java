package sakilaemployeetask;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeSolution {

    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException{
        CreateInstance createInstance=CreateInstance.getInstance();
        Connection connection=createInstance.makeConnection();

        createInstance.createTable(connection);
        createInstance.addPrimaryKeyAndAddNewColumn(connection);
        createInstance.insertData(connection);
        createInstance.printEmpData(connection);

        connection.close();
    }
}
