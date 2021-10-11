import java.util.List;
class Customer{
	private String _name;
	// use generics to store rentals
	private List <Rental> _rentals;
	public Customer (String name, List <Rental> movies){
		_name = name;
		_rentals = movies;
	}
	public List<Rental> getRentals(){
		return _rentals;
	}
	// get name of custumer
	public String getName(){
		return _name;
	}
	//  convert to string
	public String toString(){
		return getName() + ": " + getRentals().toString();
	}
	//Get total
	public double getTotal(Rental each){
		return each.getCharge();

	}
 	 // Statement
 	public String statement() {

		double totalAmount = 0;
		int frequentRenterPoints = 0;
		// String result = "Statement for " + getName() + "\n";
		String result = "";
		for(Rental each: _rentals){
			double thisAmount = 0;
			//determine amounts for each line
			//show figures for this rental
			result += "  " + each.getMovie().getTitle()+ "  " +
			String.valueOf(getTotal(each)) + "\n";
			totalAmount += getTotal(each);
			// add frequent renter points
			frequentRenterPoints += getFrequentRenterPoints(each);
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) +
		"\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
		+
		" frequent renter points" + "\n";
		return result;
		}
	// getFrequentRenterPoints
 	public int getFrequentRenterPoints(Rental each){
 		int frequentRenterPoints = 0;

		frequentRenterPoints ++;
		// add bonus for a two day new release rental
		if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
		&&
			each.getDaysRented() > 1) frequentRenterPoints ++;
		
		return frequentRenterPoints;
 	}
 	// TEST
}
