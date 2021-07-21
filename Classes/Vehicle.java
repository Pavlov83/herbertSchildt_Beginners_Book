public class Vehicle {

    int passengers; //number of passengers
    int fuelcap; //fuel capacity in gallons
    int mpg;     //fuel consumption in miles per gallon

public static void main(String[] args){

    Vehicle minivan1 = new Vehicle();
    Vehicle sportscar = new Vehicle();

    int range1,range2;

    minivan1.passengers = 7;
    minivan1.fuelcap = 65;
    minivan1.mpg = 21;

    sportscar.passnegers = 2;
    sportscar.fuelcap = 20;
    sportscar.mpg = 2;

    System.out.println("Minivan can carry: " + minivan.passengers + minivan.fuelcap + "gallons");
    System.out.println("Sportscar can carry: " + sportscar.passengers + sportscar.fuelcap + "gallons");

   }
    
}
