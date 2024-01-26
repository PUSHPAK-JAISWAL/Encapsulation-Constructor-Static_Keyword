// this is a java program to explain working of this() and super()
class student1
{
    private String name;
    private int age;
    public student1()
    {
        super();
        System.out.println("default constructor is called");
        name = "rahul";
        age = 18;
    }
    public student1(String name)
    {
        this();
        this.name = name;
        age =  19;
    }
    public student1(String name, int age)
    {
        this.name = name;
        this.age  = age;
    }
    public void display()
    {
        System.out.println(name+" "+age);
    }
}
// this is main method class
public class E5
{
    public static void main(String[]args)
    {
        student1 obj1 = new student1();
        student1 obj2 = new student1("pushpak");
        student1 obj3 = new student1("pushpak",18);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}