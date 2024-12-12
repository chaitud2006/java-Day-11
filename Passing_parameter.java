import java.util.*;
public class Passing_parameter
{
    String name;
    Passing_parameter(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        Passing_parameter o=new Passing_parameter("Chaithra");
        o.agt();
    }
}
class teacher{
    public void teach(Passing_parameter s)
    {
        s.dis1();
    }
}