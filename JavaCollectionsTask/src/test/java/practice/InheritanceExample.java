package practice;


class Animal {
    protected String name;
    void eat(){
        System.out.println("Animal eating....");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating....");
        System.out.println(name);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("\\t");
    }
}
