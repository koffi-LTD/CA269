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
		//add footer lines
		return htmlStatement();
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
 	// Get the total frequent points
 	public int getTotalFrequentRenterPoints(){
 		int totalPoint = 0;
		for(Rental each: _rentals)
			totalPoint += getFrequentRenterPoints(each);

 		return totalPoint;
 	}
 	// Total charge
	public double getTotalCharge(){
		double totalCharge = 0;
		for(Rental each: _rentals)
			totalCharge += getTotal(each);

		return totalCharge;
	}

	// Html statement
	public String htmlStatement(){
		String result = "<h1>Statement for " + getName() + "</h1>\n" + "<ol>\n";
		for(Rental each: _rentals){
			result += "  <li>" + each.getMovie().getTitle()+ "  " +
			String.valueOf(getTotal(each)) + "</li>\n";
		}
		//add footer lines
		result += "</ol>\n";
		result += "<p>Amount owed is " + String.valueOf(getTotalCharge()) +
		"</p>\n";
		result += "<p>You earned " + String.valueOf(getTotalFrequentRenterPoints())
		+
		" frequent renter points." + "</p>\n";

		return result;

	}
}
// Result
// <h1>Statement for Donald</h1>
// <ol>
//   <li>James Bond does Java  18.0</li>
//   <li>Mickey Mouse  24.0</li>
//   <li>The Pointer Sisters  4.0</li>
//   <li>The Dointer Sisters  6.0</li>
// </ol>
// <p>Amount owed is 52.0</p>
// <p>You earned 5 frequent renter points</p>
// // Expected result
// <h1>Statement for Donald</h1>
// <ol>
//   <li>James Bond does Java  18.0</li>
//   <li>Mickey Mouse  24.0</li>
//   <li>The Pointer Sisters  4.0</li>
//   <li>The Dointer Sisters  6.0</li>
// </ol>
// <p>Amount owed is 52.0</p>
// <p>You earned 5 frequent renter points.</p>