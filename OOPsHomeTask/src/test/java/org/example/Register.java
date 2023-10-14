package org.example;

import java.util.List;

public class Register {
    public String findDayOfTheWeek(String inputDay,int numberOfDays)
    {
        List<String> list=List.of("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
        int index=list.indexOf(inputDay);
        int result=(numberOfDays%7)+index;
        String resultDay="Start the course on:"+list.get(result);
        return resultDay;
    }
}
