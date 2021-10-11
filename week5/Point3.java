// Here is the Point class
import java.lang.Math;
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
        // Compare the sqrt of the distances.
        return Math.sqrt((this.x*this.x) + (this.y* this.y)) < Math.sqrt((otherPoint.x * otherPoint.x)+ (otherPoint.y * otherPoint.y));
    }
}