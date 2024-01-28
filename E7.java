// this program show how static and non static components work
class demo
{
    // this is declaration of static variable
    static int a;
    static int b;

    // this is declaration of non static variable
    int m;
    int n;

    // creation of static block
    static
    {
        System.out.println("control is in static block");
        a = 10;
        b = 20;
    }

    // creation of non static method
    {
        System.out.println("control is in non static block");
        m = 30;
        n = 40;
    }

    // this is static method
    static void display()
    {
        System.out.println("value of static variable a:"+a);
        System.out.println("value of static variable b:"+b);
    }

    // this is non static method
    void display2()
    {
        System.out.println("value of non static variable m:"+m);
        System.out.println("value of non static variable n:"+n);
    }
}


// this is the main method class
public class E7
{
    public static void main(String args[])
    {
        demo d = new demo();

        // this is calling of static method
        demo.display();

        // this is calling of nonstatic method
        d.display2();
    }

}