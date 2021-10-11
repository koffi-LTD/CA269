import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test1{
	public static void large(Truck [] vehicules){
		// initialize a new list
		List <String> bigEngines = new ArrayList<String>();
		for (int i=0; i < vehicules.length; i++) {
			if (vehicules[i].getEngineSize()>= 1200 || vehicules[i].getEngineSize()<= 1800) {
				bigEngines.add(vehicules[i].getMake());
			}
		}
		List arr = Arrays.asList(bigEngines);
	}
	   public static void main(String [] args)
   {
      Truck [] fleet = {
               new Truck("Honda", 1200),
               new Truck("Fiat", 900),
               new Truck("Renault", 1900),
               new Truck("Citroen", 900),
               new Truck("Audi", 1700),
               new Truck("Skoda", 1000),
            };

      // Convert array to a List
      List<Truck> trucks = Arrays.asList(fleet);
      
      // Call the student's program
      List<Truck> large = Test1.large(trucks);

      for(Truck truck : large)
         System.out.println(truck);
   }
}
