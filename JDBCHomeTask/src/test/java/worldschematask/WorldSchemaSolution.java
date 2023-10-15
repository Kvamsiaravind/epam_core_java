package worldschematask;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class WorldSchemaSolution {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        CreateInstance createInstance=CreateInstance.getInstance();
        Connection connection=createInstance.makeConnection();

        DisplayLastTenRows displayLastTenRows=new DisplayLastTenRows();
        displayLastTenRows.displayLastTenRows(connection);

        HighestPopulation highestPopulation=new HighestPopulation();
        highestPopulation.highestPopulation(connection);

        IslandAndLifeExpectency islandAndLifeExpectency=new IslandAndLifeExpectency();
        islandAndLifeExpectency.getRecordsIslandAndLifeExpectency(connection);

        CountriesAndLanguagesCount countriesAndLanguagesCount=new CountriesAndLanguagesCount();
        countriesAndLanguagesCount.getCountOfLanguagesSpeakedByCountries(connection);

        CountOfCountries countOfCountries=new CountOfCountries();
        countOfCountries.getCountOfCountriesWhichGotIndependenceAfter1971(connection);

        CityInnerjoinCountry cityInnerjoinCountry=new CityInnerjoinCountry();
        cityInnerjoinCountry.performInnerjoinBetweenCityAndCountry(connection);

        DisplayCountOfCitiesUsingInnerJoin displayCountOfCitiesUsingInnerJoin=new DisplayCountOfCitiesUsingInnerJoin();
        displayCountOfCitiesUsingInnerJoin.getTotalCountOfCitiesBetweenCountryAndCityUsingInnerJoin(connection);

        CreateAndModifyView createAndModifyView=new CreateAndModifyView();
        createAndModifyView.creatingAndModifyAView(connection);

        PrintCityView printCityView=new PrintCityView();
        printCityView.printingCityViews(connection);
    }
}
