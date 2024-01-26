// this is a class to show how the static keyword works
public class E6
{

    static int a;
    static
    {
        System.out.println("Static block");
        a=10;
        System.out.println(a);
    }
    public static void main(String args[])
    {
        System.out.println("main method");
    }
}