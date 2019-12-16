package vehicles;

import vehicles.Vehicle;

//bike directly extends vehicle
public class Bike extends Vehicle{
 
 	//simple constructor
 	//we don't need to get in this constructor boolean isEco, because all bikes are ecological
    public Bike(int s){
    	super(s,true);
    }
    
    //implementation of abstract method of Vehicle
    public void go(){
    	System.out.println("Bike is being rided. Speed: " + speed);
    }

}
