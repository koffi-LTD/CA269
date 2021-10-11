public abstract class Animal{
    public Animal(String n)
    {
        name = n;
    }

    abstract String sound();
    
    public String greeting()
    {
        return sound() + ", I am " + name;
    }
    // private
    private String name;
}
