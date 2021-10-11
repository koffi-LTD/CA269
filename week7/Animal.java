// An abstract Animal class
// and a method called greeting which returns a String.
// public abstract class Animal{
// 	public abstract String greeting();
// }
// class Pig extends Animal
// {
//     // since Animal has an abstract method greeting(), Pig needs to implement greeting.
//     public void greeting()
//     {
//         return "Oink";
//     }
// }

public abstract class Animal
{
    public Animal(String n)
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
