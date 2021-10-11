public class Period{
	private Time start;
	private Time end;
	public Period(Time time1, Time time2){
		start = time1;
		end = time2;
	}
	// chech if two Periods overlap
	public boolean overlaps(Period otherperiod){

		if (start.isLater(otherperiod.start && otherperiod.end.isLater(start))) {
			return true;
			
		}
		if (otherperiod.start.isLater(start) && otherperiod.end.isLater(end)) {
			return true;
		}
		return false
	}

	public String toString(){
		return time1 + "->" + time2;
	}
}