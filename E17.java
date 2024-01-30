// this is a program to show constructor example
public class E17
{
    String name;
    int age;
    public E17()
    {
        // this is the default constructor
    }
    public E17(String name, int age)// this is the operational constructor
    {
        this.name = name;
        this.age = age;
        System.out.println("name is :- "+ this.name+" age is :- "+ age);
    }
    public static void main(String []args)// this is the main method
    {
        E17 a = new E17("rahul",10);
        E17 b = new E17("pushpak",18);
    }
}