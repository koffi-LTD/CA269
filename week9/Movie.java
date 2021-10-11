class Movie{
	public static final int CHILDRENS = 2;
 	public static final int REGULAR = 0;
 	public static final int NEW_RELEASE = 1;

 	private String _title;
 	private int _PriceCode;
 	public Movie(String title, int priceCode){
 		_title = title;
 		_PriceCode = priceCode;
 	}

 	public int getPriceCode(){
 		return _PriceCode;
 	}
 	 public void setPriceCode(int arg){
 		_PriceCode = arg;
 	}
 	public String getTitle(){
 		return _title;
 	}
}