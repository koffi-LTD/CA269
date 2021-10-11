class Rental{
	private Movie _movie;
	private int _dayRented;

	public Rental(Movie movie, int dayRented){
		_movie = movie;
		_dayRented = dayRented;
	}
	public int getDaysRented(){
		return _dayRented;
	}
	public Movie getMovie(){
		return _movie;
	}
	public String toString(){
		return getMovie() + " " + getDaysRented();
	}
	// getCharge method
	public double getCharge() {
		double thisAmount = 0;
		switch (_movie.getPriceCode()){
			case Movie.REGULAR:
				thisAmount += 2;
				if (_dayRented > 2)
					thisAmount += (_dayRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += _dayRented * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (_dayRented > 3)
					thisAmount += (_dayRented - 3) * 1.5;
				break;
		}
	return thisAmount;
	}



}