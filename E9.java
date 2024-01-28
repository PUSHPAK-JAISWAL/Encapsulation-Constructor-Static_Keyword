// this is a program to show difference in between static and non static method
import java.util.*;

class demo
{
    static void display()
    {
        System.out.println("Static method");
    }

    void display1()
    {
        System.out.println("non static method");
    }
}

// this is the main method
public class E9 
{
    public static void main(String args[])
    {
        demo.display();// for static method no need for object
         
        // for non static method object is needed
        demo a = new demo();
        a.display1();
        a.display();// static method can be called with the help of object
        // but as such there is no need

        Arrays.sort(args);// this is a static method inbuilt by java.
    }
    
}