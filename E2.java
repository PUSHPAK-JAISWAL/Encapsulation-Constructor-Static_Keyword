// this is the first class to show case the encapsulation with the help of same slide side
class student
{
    private int age;
    private String name;
    public void setAge(int age )
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
    public void show()
    {
        System.out.println(name + " " + age);
    }
}
// this is the main method class
public class E2 
{
    public static void main(String args[])
    {
        student obj = new student();
        student obj1 = new student();
        obj.setAge(12);
        obj.setName("rahul");
        obj.show();
        obj1.setAge(18);
        obj1.setName("pushpak");
        obj1.show();
        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();
        System.out.println(stud1Age);
        System.out.println(stud1Name);
    }
}