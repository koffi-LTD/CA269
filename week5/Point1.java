// Here is the Point class
public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    // boolean method lessThan
    public boolean lessThan(Order other){
        Point otherPoint = (Point) other;
        if (this.x == otherPoint.x) {
            return this.y < otherPoint.y;            
        }
        return this.x < otherPoint.x;
    }
}