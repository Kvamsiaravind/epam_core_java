package worldschematask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IslandAndLifeExpectency {
    public void getRecordsIslandAndLifeExpectency(Connection connection) throws SQLException {
        String query="select * from country where name like '%Island%' and lifeexpectancy>70";
        try(PreparedStatement ps=connection.prepareStatement(query)){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
            }
        }
    }
}
