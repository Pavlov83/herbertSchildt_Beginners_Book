public class Vehicle {

    int passengers; //number of passengers
    int fuelcap; //fuel capacity in gallons
    int mpg;     //fuel consumption in miles per gallon

public static void main(String[] args){

    Vehicle minivan = new Vehicle();
    int range;

    minivan.passengers = 7;
    minivan.fuelcap = 65;
    minivan.mpg = 21;

    System.out.println("Minivan can carry: " + minivan.passengers + minivan.fuelcap + "gallons");


   }
    
}
