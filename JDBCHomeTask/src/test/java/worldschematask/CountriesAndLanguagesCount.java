package worldschematask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class CountriesAndLanguagesCount {

public static Logger logger= LogManager.getLogger(CountriesAndLanguagesCount.class);
    public void getCountOfLanguagesSpeakedByCountries(Connection connection){
        String query="select language,count(*) from countrylanguage where Isofficial='T' group by language";
        try(Statement st=connection.createStatement()){
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
