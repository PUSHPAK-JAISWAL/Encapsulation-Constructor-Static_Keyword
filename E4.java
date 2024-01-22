class Demo
{
    private int a;
    private int b;
    Demo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class E4
{
    public static void main(String [] args)
    {
        Demo d = new Demo(10,20);
        d.display();
    }
}