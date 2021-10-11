// This class cant do much. It can be created and printed.
public class Cat implements Polite
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
    // The hello method
    public void hello(){
        
    }
}