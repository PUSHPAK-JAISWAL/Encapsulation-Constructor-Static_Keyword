// this is a program to differentiate between static block and java intilization block
public class E10
{
    static int age;

    static
    {
        System.out.println("Static block");
        age = 18;
    }

    static void display()
    {
        System.out.println("Display static method");
        System.out.println(age);
    }

    public static void main(String []args)
    {
        System.out.println("main method");
        display();
    }
}