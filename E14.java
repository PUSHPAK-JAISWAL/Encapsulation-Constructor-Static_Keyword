// this  is a program to show the use of static keyword
public class E14
{
    static int a;
    static int b;
    static int c;
    static
    {
         a = 10;
         b = 20;
    }
    public static void main(String []args)
    {
        c = a+b;
        System.out.println(c);
    }
}
