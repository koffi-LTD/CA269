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
}