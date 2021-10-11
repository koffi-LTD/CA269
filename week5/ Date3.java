public class Date3{
	private int day;
	private int month;
	private int year;
	public Date3(String input){
		String[] result = input.split(" ");

		day = Integer.parseInt(result[0]);
		month = Integer.parseInt(result[1]);
		year = Integer.parseInt(result[2]);
	}

	public Boolean isOnOrAfter(Date3 day2){
		if (this.day < day2.day) {
			return false;

		}
		else if (this.day > day2.day){
			return true;
		}
		if (this.month < day2.month) {
			return false;
		}
		else if (this.month > day2.month){
			return true;
		}
		if (this.year < day2.year) {
			return false;

		}
		else if (this.year > day2.year){
			return true;
		}
		return true;

	}

	public String toString(){
		return day + "/" + month + "/" + year;
	}
	public static void main(String[] args) {

		Date3 day1 = new Date3("27 7 2006");
		Date3 day2 = new Date3("27 7 2007");

		System.out.println(day1.isOnOrAfter(day2)); // prints false. day1 is not after day2
		System.out.println(day2.isOnOrAfter(day1)); // prints true. day2 is after day1	
	}
}