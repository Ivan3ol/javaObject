package ivan3ol;

// import ivan3ol.Vehicle;
import java.util.ArrayList;
import java.util.List;
import vehicles.Vehicle;
import vehicles.Bike;
import vehicles.cars.Car;
import vehicles.cars.Tesla;
import vehicles.parts.Engine;
import vehicles.cars.BMW;



public class Dispatcher {

	public static void main(String[] args) {
		//creating the list that may contain all types of vehicles
		List<Vehicle> list = new ArrayList<>();
		//adding vehicles to the list
		list.add(new Bike(30));
		list.add(new Bike(20));
		list.add(new Tesla(new Engine("Electro", 400),200));
		list.add(new Tesla(new Engine("Electro", 600),250));
		list.add(new BMW(new Engine("V8", 450),210));
		list.add(new BMW(new Engine("V12", 750),300));
	 	
	 	//using polymorphism calling the abstract method of Vehicle for each object in list
		for(Vehicle v: list){
			v.go();
		}
	 
		System.out.println("Not ecological vehicles are going on");
		//using polymorphism getting all not ecological vehicles from list
		for(Vehicle v: list){
			if(!v.isEco()){
				v.go();
			}
		}
	}
}


 


 
