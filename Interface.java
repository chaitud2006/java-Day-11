import java.util.*;
interface mobileapp
{
    public void menu();
    public void rating();
    public void contact();
}
        class b implements mobileapp
        {
            public void menu()
            {
                System.out.println("Hello");
            }
            public void rating()
            {
                System.out.println("Hello Chaithra");
            }
            public void contact()
            {
                System.out.println(988989989);
            }
        }
    
        public class Interface
        {
            public static void main(String args[])
            {
                b a=new b();
                a.contact();
            }
        }
        
 
