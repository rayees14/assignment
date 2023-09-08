import java.lang.*; 
import java.util.*;

// Class name with RoadToll
public class RoadToll {
	
	// Member Variables
    String TypeOfVehicle;
    int NumberOfTires;

    // Constructor
    public RoadToll(String TypeOfVehicle, int NumberOfTires) {
        this.TypeOfVehicle = TypeOfVehicle;
        this.NumberOfTires = NumberOfTires;
        }

   // Method to calculate Road Toll for Vehicles
    public double calculateRoadToll() {
        if (NumberOfTires == 2) {
            return 0.00;
        } else if (NumberOfTires == 4) {
            return 50.00;
        } else if (NumberOfTires > 4) {
            return 100.00;
        }
        else {
        	return -1.00; // Invalid Number Of Tires
        }
      }

    public static void main(String[] args) {
    	
    	// Objects
    	RoadToll motorcycle = new RoadToll("Motorcycle", 2);
    	RoadToll car = new RoadToll("Car", 4);
    	RoadToll truck = new RoadToll("Truck", 6);
    	RoadToll auto = new RoadToll("Auto", 3);
       
        double vehicleToll1 = motorcycle.calculateRoadToll();
        double vehicleToll2 = car.calculateRoadToll();
        double vehicleToll3 = truck.calculateRoadToll();
        double vehicleToll4 = auto.calculateRoadToll();
        
        System.out.println("Toll for " + motorcycle.TypeOfVehicle + " with " + motorcycle.NumberOfTires + " Tires : Rs. " + vehicleToll1);
        System.out.println("Toll for " + car.TypeOfVehicle + " with " + car.NumberOfTires + " Tires : Rs. " + vehicleToll2);
        System.out.println("Toll for " + truck.TypeOfVehicle + " with " + truck.NumberOfTires + " Tires : Rs. " + vehicleToll3);
        System.out.println("Toll for " + auto.TypeOfVehicle + " with " + auto.NumberOfTires + " Tires : Rs. " + vehicleToll4);
        
    }
}
