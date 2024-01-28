// this is a basic loan application to show use of static components
import java.util.*;

class Farmer
{
    int pa;// variable for princliple amount
    float td;//variable for time duration
    static float ri;//variable for rate of intrest
    float si;//variable for simple intrest

    // the static block for ri as it is common and not changing
    static
    {
        ri = 4.5f;
    }
    void input()// this is a method to input the pa,td from the user
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount required");
        pa = scan.nextInt();
        System.out.println("Please enter the time duration for the loan");
        td = scan.nextFloat();
    }

    // this method is to calculate the loan amount
    void compute()
    {
        si = (pa*ri*td)/100f;
    }

    // this method is to show the simple intrest
    void display()
    {
        System.out.println("Simple intrest for the given amount and the time duration is:- " +si);
    }
}

// this is the main method class
public class LaunchFarmer
{
    public static void main(String args[])
    {
        // object creation
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        // method calling for f1
        f1.input();
        f1.compute();
        f1.display();

        // method calling for f2
        f2.input();
        f2.compute();
        f2.display();
    }
}