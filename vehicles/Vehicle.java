package vehicles;



//this class is main in our inheritance tree
public abstract class Vehicle {
	//every vehicle has some speed and is ecological or not
	//fields are private according to encapsulation rules
	private int speed;
	private boolean isEco;

	//every vehicle can move
	//abstract because we don't know how exactly it can move
	public abstract void go();
 
 	//default simple constructor 
	public Vehicle(int sd, boolean eco){
		this.speed = sd;
		this.isEco = eco;
 	}
 	
 	//method allows get speed of vehicle in any context
 	public int getSpeed(){
 		return this.speed;
 	}

 	//check if the vehicle is ecological
 	public boolean isEco(){
 		return this.isEco;	
 	}
 }