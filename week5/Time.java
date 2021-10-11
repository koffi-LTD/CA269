import java.util.Scanner;

public class Time
{
   // Private variables
   private int hours;
   private int minutes;
   // Constructor (with a String parameter)
    public Time(String input){
		hours = Integer.parseInt(input.substring(0, 2));
		minutes = Integer.parseInt(input.substring(2, 4));
    }
	
   // isLater(Time otherTime) // boolean method to compare two times
   
    public boolean isLater(Time time2){
		return (this.hours * 60 + this.minutes) < (time2.hours *60 + time2.minutes);
	}
   // String toString() // return a String representation of the time (hh:mm)
   	public String toString(){
		return hours+ ":"+minutes;
	}

	public class Main
{
   public void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      String line1 = "1200";
      String line2 = "1200";

      Time time1 = new Time(line1);
      Time time2 = new Time(line2);

      if(time1.isLater(time2))
         System.out.println(time1 + " is later than " + time2);
      else
         System.out.println(time1 + " is not later than " + time2);
   }
}
   
}