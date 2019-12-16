package vehicles.cars;
import vehicles.Vehicle;
import vehicles.parts.Engine;

//car is a vehicle, so it extends a Vehicle

//however we don't know what exactly car is it
//methods go() could be different in different cars
//also car could be or ecological or not
//therefore car is abstract
public abstract class Car extends Vehicle{

	//every car must have engine
	protected Engine engine;
	
	//simple constructor
	protected Car(int s, Engine e, boolean eco){
		//explicit call of superclass constructor
		//because superclass doesn't have no-argument constructor
		super(s,eco);
    	this.engine = e;
   	}

   	//we don't implement go() method because the class is abstract
 }
 