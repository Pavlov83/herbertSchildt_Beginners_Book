class MethodsPractice{

    int loadCapacity;
    int mainTank;
    int consumption;
    int rangeDistance;

}

class ApplyMethods{

    Vehicle car5 = new Vehicle();
    car5.mainTank = 20;
    car5.consumption = 8;

    getRange(){
        rangeDistance = car5.mainTank * car5.consumption;
        return System.out.println(rangeDistance);

    }

}