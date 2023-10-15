package worldschematask;

import java.sql.*;

public class DisplayCountOfCitiesUsingInnerJoin {
    public void getTotalCountOfCitiesBetweenCountryAndCityUsingInnerJoin(Connection connection) throws SQLException {
        String query="select count(ci.name) as cities_count, cou.headofstate from city ci inner join country cou on ci.countrycode=cou.code group by cou.headofstate";
        try(PreparedStatement ps= connection.prepareStatement(query)){
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        }
    }
}
