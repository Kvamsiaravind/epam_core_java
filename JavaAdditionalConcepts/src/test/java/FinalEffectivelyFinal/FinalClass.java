package FinalEffectivelyFinal;

@FunctionalInterface
interface AddInterface{
    public int method(int a,int b);
}
public class FinalClass {
    public static void main(String[] args) {
        int value=7;
        AddInterface addInterface=(a,b) -> a+b;
    }
}
