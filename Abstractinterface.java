import java.util.*;
abstract interface Math
{
    void print();
}
class d implements Math
{
    public void print()
    {
        System.out.println("Hello");
    }
}
public class Abstractinterface
{
    public static void main(String arg[])
    {
        d f=new d();
        f.print();
    }

}


