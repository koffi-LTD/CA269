import java.util.List;
class Customer{
 	private String _name;
 	// use generics to store rentals
 	private List <Rental> _rentals;
 	public Customer(String name, List <Rental> movies){
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
 	 // Statement
 	public String statement() {

		double totalAmount = 0;
		int frequentRenterPoints = 0;
		// String result = "Rental Record for " + getName() + "\n";
		String result = "";
		for(Rental each: _rentals){
			double thisAmount = 0;
			//determine amounts for each line
			thisAmount = getTotal(each);
				// add frequent renter points
				frequentRenterPoints ++;
				// add bonus for a two day new release rental
				if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&&
					each.getDaysRented() > 1) frequentRenterPoints ++;
					//show figures for this rental
				result += "  " + each.getMovie().getTitle()+ "  " +
				String.valueOf(thisAmount) + "\n";
				totalAmount += thisAmount;
				}
				//add footer lines
				result += "Amount owed is " + String.valueOf(totalAmount) +
				"\n";
				result += "You earned " + String.valueOf(frequentRenterPoints)
				+
				" frequent renter points"+ "\n";
				return result;
		}
		//Get total
		public double getTotal(Rental each) {
			double thisAmount = 0;
			switch (each.getMovie().getPriceCode()){
				case Movie.REGULAR:
					thisAmount += 2;
					if (each.getDaysRented() > 2)
						thisAmount += (each.getDaysRented() - 2) * 1.5;
					break;
				case Movie.NEW_RELEASE:
					thisAmount += each.getDaysRented() * 3;
					break;
				case Movie.CHILDRENS:
					thisAmount += 1.5;
					if (each.getDaysRented() > 3)
						thisAmount += (each.getDaysRented() - 3) * 1.5;
					break;
			}
			return thisAmount;
		}

}
// Your statement:
//   James Bond does Java  3.0
//   Mickey Mouse  12.0
//   The Pointer Sisters  2.0
// Amount owed is 17.0
// You earned 3 frequent renter points