package singletonPattern;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;

    public CandyMaker() {
        empty = true;
        boiled = false;
    }

    public static class Holder {
        static final CandyMaker candyMaker = new CandyMaker();
    }

    public static CandyMaker getGlobalInstance() {
        return Holder.candyMaker;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    //to boil the mixture the boiler has to be full and not already boiled.
    //once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
