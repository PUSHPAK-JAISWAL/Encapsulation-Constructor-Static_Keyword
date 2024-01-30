//Use a private keyword for a variable and use setter and getter methods to initialise and print the values.
public class E18
{
    private String name;
    private int age;
    public void setAge(int age)// setter for age
    {
        this.age = age;
    }
    public int getAge()// getter for age
    {
        return age;
    }
    public void setName(String name)// setter for name
    {
        this.name = name;
    }
    public String getName()// getter for name
    {
        return name;
    }
    public void display()
    {
        System.out.println(age+" "+name);
    }
    public static void main(String []args)// this is main method
    {
        E18 a = new E18();
        E18 b = new E18();
        a.setAge(10);
        a.setName("rahul");
        b.setAge(18);
        b.setName("pushpak");
        a.display();
        b.display();
    }
}
