// this is a class to count the number of instance called with static variable
public class E16
{
    static int number;
    public E16()
    {
        number++;
    }
    public static int getNumber()
    {
        return number;
    }

    public static void main(String []args)
    {
        E16 a = new E16();
        E16 b = new E16();
        E16 c = new E16();
        E16 d = new E16();
        E16 e = new E16();
        System.out.println("The number of instance created are "+ E16.getNumber());
    }
}