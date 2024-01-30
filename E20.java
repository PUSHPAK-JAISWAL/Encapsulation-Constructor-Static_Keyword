// a program which has static block and constructor overloading,initialise variables using constructors and print it.
public class E20 
{
    private int age;
    private String name;
    static 
    {
        System.out.println("this is a static block");
    }
    public E20()
    {
        System.out.println(age+" "+name);
    }
    public E20(int age)
    {
        this();
        this.age = age;
        System.out.println("the age is :- "+age);
    }
    public E20(String name, int age)
    {
        this(age);
        this.name = name;
        System.out.println("The name is :- "+name);
    }
    public static void main(String []args)
    {
        E20 a = new E20(10);
        E20 b = new E20("pushpak",20);
    }
}