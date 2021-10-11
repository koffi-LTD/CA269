class Movie{

public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	public Price price;
	public Movie(String title, int priceCode){
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode(){
		return price.getPriceCode();
	}
	public void setPriceCode (int arg){
		if (arg == REGULAR){
			price = new RegularPrice();
		}
		else if (arg==NEW_RELEASE){
		    price = new NewReleasePrice();
		}
		else{
		    price = new ChildrensPrice();
		}
		
	}
	public String getTitle(){
		return _title;
	}
}
