package MarkerInterface;

import java.lang.Cloneable;

class Project implements Cloneable{
    int id;
    String name;
    public Project(int id, String name)
    {
        super();
        this.id=id;
        this.name=name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class MarkerInterfaceClass {
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        Project obj1 = new Project(101, "Zaggle Card");

        Project obj2 = (Project)obj1.clone();

        System.out.println(obj2.id);
        System.out.println(obj1.name);
    }
}
