package worldschematask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CityInnerjoinCountry {
    public void performInnerjoinBetweenCityAndCountry(Connection connection){
        String query="select ci.name as city_name,ci.population as city_population,cou.name as country_name,cou.headofstate as head_of_state from city ci inner join country cou  ON ci.countrycode=cou.code";
        try(Statement st=connection.createStatement()){
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
