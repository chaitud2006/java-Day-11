import java.util.*;
class DefaultConstructor
{
    int c;
    String b;
    DefaultConstructor()
    {
        this.c=345;
        this.b="Hello";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }

    public static void main(String args[])
    {
        DefaultConstructor s=new DefaultConstructor();
        s.display();
    }
}

