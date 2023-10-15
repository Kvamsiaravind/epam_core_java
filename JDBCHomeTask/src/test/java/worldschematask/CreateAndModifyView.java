package worldschematask;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateAndModifyView {
    public void creatingAndModifyAView(Connection connection){
        String query="create view city_views as (select ci.Name as city_name,co.Name as country_name,co.Continent,co.HeadOfState,cl.language from city as ci join country as co on ci.CountryCode=co.Code" +
                " join countrylanguage as cl on co.Code=cl.CountryCode where cl.IsOfficial='T' )";
        try(Statement st= connection.createStatement()){
            long n=st.executeUpdate(query);
            if(n>0){
                String query1="alter view city_views as (select ci.Name as city_name,co.Name as country_name,co.Continent,co.GovernmentForm,co.HeadOfState,cl.language from city as ci join country as co on ci.CountryCode=co.Code" +
                        " join countrylanguage as cl on co.Code=cl.CountryCode where cl.IsOfficial='T' );";
                try(Statement stmt= connection.createStatement()){
                    long numberOfrows= stmt.executeUpdate(query1);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
