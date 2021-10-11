public abstract class Animal2
{
    public Animal2(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + "my name is " + name;
    }
    // private
    private String name;
}