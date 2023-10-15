package worldschematask;

import java.sql.*;

//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class DisplayLastTenRows {

//    private static final Logger logger= LogManager.getLogger(DisplayLastTenRows.class);
    public void displayLastTenRows(Connection connection){
        String query="(select * from country order by code desc limit 10)order by code";
        try(Statement ps=connection.createStatement()){
            ResultSet rs=ps.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
