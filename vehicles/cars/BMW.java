package vehicles.cars;

import vehicles.cars.Car;
import vehicles.parts.Engine;

//BMW is a car, so it extends Car
public class BMW extends Car{
	
	//simple constructor
	//we doesn't need isEco, because BMW is always not ecological (Of course I know that really it is not so, but for OOPS....)
	public BMW(Engine e, int s){
		super(s,e,false);
	}
   
   	//implementation of Vehicle's go method
	public void go(){
		getEngine().printInfo();
    	System.out.println("BMW is going on. Speed: " + getSpeed());
   	}
 }