package vehicles;



//this class is main in our inheritance tree
public abstract class Vehicle {
	//every vehicle has some speed and is ecological or not
	//protected because only childs must have direct access to the fields
	protected int speed;
	protected boolean isEco;

	//every vehicle can move
	//abstract because we don't know how exactly it can move
	public abstract void go();
 
 	//default simple constructor 
	public Vehicle(int sd, boolean eco){
		this.speed = sd;
		this.isEco = eco;
 	}
 	
 	//check if the vehicle is ecological
 	public boolean isEco(){
   		return isEco;
 	}
 }