package worldschematask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighestPopulation {

//    private static Logger logger= LogManager.getLogger(HighestPopulation.class);
    public void highestPopulation(Connection connection){
        String query="select name,population from city where Population=(select max(Population) from city)";
        try(Statement st=connection.createStatement()){
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
