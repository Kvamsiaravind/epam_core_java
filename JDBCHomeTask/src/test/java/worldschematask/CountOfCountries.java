package worldschematask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountOfCountries {
    public void getCountOfCountriesWhichGotIndependenceAfter1971(Connection connection){
        String query="select count(*) as total_independent_countries  from country where IndepYear>1971";
        try(Statement st=connection.createStatement()){
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("Total independent countries after 1971 :"+rs.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
