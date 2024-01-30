// this show the example of static block execute before main method
public class E15
{
    static int a;
    static int b;
    static int c;
    static
    {
        a = 10;
        b = 20;
        System.out.println("static block");
    }
    public static void main(String []args)
    {
        c = a+b;
        System.out.println("main method");
        System.out.println(c);
    }
}