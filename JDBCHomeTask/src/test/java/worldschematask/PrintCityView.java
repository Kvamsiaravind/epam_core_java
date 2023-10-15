package worldschematask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintCityView {
    public void printingCityViews(Connection connection){
        String query="Select * from city_views";
        try(Statement st= connection.createStatement()){
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
