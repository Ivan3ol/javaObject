package ivan3ol;

import ivan3ol.Vehicle;
import java.util.ArrayList;
import java.util.List;



public class Dispatcher {

  public static void main(String[] args) {
   List<Vehicle> list = new ArrayList<>();
   list.add(new Bike(30));
   list.add(new Bike(20));
   list.add(new Tesla(new Engine("Electro", 400),200));
   list.add(new Tesla(new Engine("Electro", 600),250));
   list.add(new BMW(new Engine("V8", 450),210));
   list.add(new BMW(new Engine("V12", 750),300));
   
   for(Vehicle v: list){
     v.go();
   }
   System.out.println("Not ecological vehicles are going on");
   for(Vehicle v: list){
     if(!v.isEco()){
       v.go();
     }
   }
  }
}

abstract class Vehicle {
protected int speed;
protected boolean isEco;
 public abstract void go();
 public Vehicle(int sd, boolean eco){
   this.speed = sd;
   this.isEco = eco;
 }
 public boolean isEco(){
   return isEco;
 }
 }
 class Engine{
   private int power;
   private String model;
   public Engine( String m, int p){
     this.power = p;
     this.model = m;
   }
   public void printInfo(){
     System.out.print("Engine: "+ model+". Power: "+ power+". ");
   }
 }
 abstract class Car extends Vehicle{
   protected Engine engine;
   protected Car(int s, Engine e, boolean eco){
     super(s,eco);
     this.engine = e;
   }
 }
 
 class BMW extends Car{
   public BMW(Engine e, int s){
     super(s,e,false);
   }
   public void go(){
   this.engine.printInfo();
     System.out.println("BMW is going on. Speed: " + this.speed);
   }
 }
 class Tesla extends Car{
   public Tesla(Engine e, int s){
     super(s,e,true);
   }
   public void go(){
   this.engine.printInfo();
     System.out.println("Tesla is going on. Speed: " + this.speed);
   }
 }
 class Bike extends Vehicle{
 
    public Bike(int s){
      super(s,true);
    }
    public void go(){
      System.out.println("Bike is being rided. Speed: " + speed);
    }
 }
