public abstract class Animal1
{
    public Animal1(String n)
    {
        name = n;
    }

    abstract String hello();
    
    public String greeting()
    {
        return hello() + ", I am " + name;
    }
    // private
    private String name;
}