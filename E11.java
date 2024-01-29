// this is a program to show the setters and getters method
class demo
{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name; 
    }

    public String getName()
    {
        return name;
    }

    public void display()
    {
        System.out.println(age+" "+name);
    }
}

public class E11
{
    public static void main(String []args)
    {
        demo a = new demo();
        demo b = new demo();
        a.setAge(19);
        a.setName("pushpak");
        b.setAge(20);
        b.setName("rahul");
        a.display();
        b.display();
    }
}