import java.util.*;
class Constructor
{
    int c;
    String b;
    Constructor(int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }

    public static void main(String args[])
    {
        Constructor s=new Constructor(678,"Chaithra");
        s.display();
    }
}

