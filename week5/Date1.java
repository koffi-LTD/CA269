public class Date1{
	private int day;
	private int month;
	private int year;
	public Date1(){
		day = 1;
		month = 1;
		year = 2000;
	}

	public String toString(){
		return day + "/" + month + "/" + year;
	}
	public static void main(String[] args) {
		Date1 beginning = new Date1();
		System.out.println(beginning);
	}
}