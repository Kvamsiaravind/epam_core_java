package SingleResponsibilityPrinciple.After;

public class ExtraFacilities {
    public boolean checkMoreFeatures(String medium) {
        if(medium.equals("radio"))
            return true;
        if(medium.equals("TV"))
            return true;
        if(medium.equals("Music"))
            return true;
        return false;
    }
}
