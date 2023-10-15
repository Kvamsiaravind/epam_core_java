package SingleResponsibilityPrinciple.After;

public class SearchBuses {
    public String search(String source, String destination,String typeOfBus) {
        if(source.equalsIgnoreCase("Kurnool"))
        {
            if(destination.equalsIgnoreCase("Ananthapur"))
            {
                if(typeOfBus.equals("AC")||typeOfBus.equals("Double decker")||typeOfBus.equals("Normal"))
                    return "Buses found";
                else if(typeOfBus.equals("open top"))
                    return "Buses not found";
            }
            if(destination.equalsIgnoreCase("kadapa"))
            {
                if(typeOfBus.equals("AC")||typeOfBus.equals("Double decker")||typeOfBus.equals("Normal"))
                    return "Buses found";
                else if(typeOfBus.equals("mini coach"))
                    return "Buses not found";
            }
        }
        return "Buses not found";
    }
}

