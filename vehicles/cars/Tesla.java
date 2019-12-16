package vehicles.cars;
import vehicles.cars.Car;
import vehicles.parts.Engine;

//Tesla is a car, so it extends Car
public class Tesla extends Car{
	
	//simple constructor
	//we doesn't need isEco, because Tesla is always ecological
	public Tesla(Engine e, int s){
		super(s,e,true);
	}
	
	//implementation of Vehicle's go method
	public void go(){
   		this.engine.printInfo();
    	System.out.println("Tesla is going on. Speed: " + this.speed);
	}
}