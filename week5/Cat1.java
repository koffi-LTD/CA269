// This class cant do much. It can be created and printed.
public class Cat  //remove the implements Polite
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return "cat: " + name;
    }
    
    public static void hello()
    {
        System.out.println("Hello");
    }
}