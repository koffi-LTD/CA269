public class Truck
{
   private String make;
   private int engineSize;

   public Truck(String make, int engineSize)
   {
      this.make = make;
      this.engineSize = engineSize;
   }

   public String getMake()
   {
      return make;
   }

   public int getEngineSize()
   {
      return engineSize;
   }
   
   public String toString()
   {
       return make + " -> " + engineSize;
   }
}