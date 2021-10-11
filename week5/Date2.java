import java.io.*;
public class Date2{
	private int day;
	private int month;
	private int year;
	public Date2(String input){
		String[] result = input.split(" ");

		day = Integer.parseInt(result[0]);
		month = Integer.parseInt(result[1]);
		year = Integer.parseInt(result[2]);
	}

	public String toString(){
		return day + "/" + month + "/" + year;
	}
	public static void main(String[] args) {
		String input = "21 03 2000";
		System.out.println(new Date2(input));
	}
}