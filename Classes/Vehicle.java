public class Vehicle{
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity in gallons
    int mpg;        //fuel consumption in miles per gallon

    //Return the range
    int range(){
        return mpg  * fuelcap;
    }

    //Compute fuel for a given distance
    double fuelNeeded(int miles){
        return(double) miles/mpg;
    }

}

class CompFuel{
    public static void main(String[] args){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        double gallons;
        int dist = 252;

        //assign values to the fields for the minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to the fields in sportscar
        sportscar.passengers = 4;
        sportscar.fuelcap = 10;
        sportscar.mpg = 4;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + "miles minivan needs " + gallons + "gallons of fuel");
        
        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + "miles sportscar needs " + "gallons of fuel");

    }
}