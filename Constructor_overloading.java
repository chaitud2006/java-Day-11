import java.util.*;
public class Constructor_overloading
{
    String name;
    Constructor_overloading()
    {
        name="Chaithra";
    }
    Constructor_overloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Constructor_overloading o=new Constructor_overloading();
        o.display();
        Constructor_overloading r=new Constructor_overloading("Chaithra");
        r.display();
    }
}