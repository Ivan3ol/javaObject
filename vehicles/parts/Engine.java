package vehicles.parts;


//the part of car is not a vehicle so it doesn't implement Vehicle
public class Engine{
	//private because these fields must be only shown, not changed
	private int power;
	private String model;

	//simple constructor
	public Engine( String m, int p){
		this.power = p;
		this.model = m;
	}

	//printing values of fields
	public void printInfo(){
		System.out.print("Engine: "+ model+". Power: "+ power+". ");
	}
}