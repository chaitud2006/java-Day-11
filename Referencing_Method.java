import java.util.*;
public class Referencing_Method
{
    void display()
    {
        System.out.println("Hello Students");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[])
    {
    Referencing_Method o=new Referencing_Method();
    o.dis1();
    }
}