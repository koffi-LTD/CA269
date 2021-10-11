class Dog extends Animal {
	private String name;
	public Dog(String name){
		super(name);
	}
	public String sound(){
		return "Woof";
	}
}