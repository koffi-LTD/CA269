import java.util.Scanner;

public class Date4
{
    private int day;
    private int month;
    private int year;

  public Date4(String input){
    String[] result = input.split(" ");

    day = Integer.parseInt(result[0]);
    month = Integer.parseInt(result[1]);
    year = Integer.parseInt(result[2]);
  }
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Insert the isAfter method here.
    public boolean isAfter(Date4 day2)
    {
    if (this.day & this.month < day2.day & day2.month || this.year < day2.year) {
      return day2;
    }

    else if(this.day & this.month > day2.day & day2.month || this.year > day2.year){
      return this;
    }

  }

    
    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date4 default_ = new Date4("0 0 0"); //Default value of time.
        while(in.hasNextLine())
        {
           line = in.nextLine();
           if(line.length() != 0)
           {
              Date4 date = new Date4(line);
              // Do what you want with the date.
              if (default_.isAfter(date)){
                default_ = date;
              }

           }

        }
        System.out.println(default_.toString()); // Print the latest date
    }
}
