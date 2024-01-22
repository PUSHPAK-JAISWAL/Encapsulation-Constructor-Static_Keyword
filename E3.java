// this is a program to impliment constructor
class person
{
    private int age;
    private String name;
    person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void display()
    {
        System.out.println(age+ " " + name);
    }
}
public class E3 
{
    public static void main(String []args)
    {
        person obj = new person("pushpak",18);
        person obj1 = new person("rahul", 10);
        obj.display();
        obj1.display();
    }
}