// this program is to show the use of this keyword
public class E12
{
    private int age;
    private String name;
    void display(int age, String name)
    {
        this.age = age;
        this.name = name;
        System.out.println(this.age+" "+this.name);
    }
    public static void main(String []args)
    {
      E12 a = new E12();
      a.display(18, "rahul");   
    }
}