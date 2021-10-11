// This class cant do much. It can be created and printed.
public class Cat implements Order
{
    private String name;
    
    public Cat(String n)
    {
        name = n;
    }
    // lessThan method to compare the length of names
    public boolean lessThan(Order other){
        Cat otherCat = (Cat) other;
        return this.name.length() < otherCat.name.length();
    }
    public String toString()
    {
        return "cat: " + name;
    }
    // The hello method
    public void hello(){
        
    }
}