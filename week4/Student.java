public class Student{
	private String name;
	private int mark;
	public Student(String n, int m){
		name = n;
		mark = m;
	}
	public void increase(int amount){
		mark = mark + amount;
	}
	public String getName()
   	{
  		return name;
   	}

   	public int getMark()
   	{
  		return mark;
   	}

}