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
 }