// this is a program to show difference in the static and instance variable
class alpha
{
    static int a;
    static int b;

    int m;
    int n;
    
    // this is static block
    static
    {
        System.out.println("static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("non static block");
        m=100;
        n = 200;
    }
}

// this is the main method class
public class E8 
{
     public static void main(String[] args)
     {
        alpha a1 = new alpha();
        alpha a2 = new alpha();

     }
    
}