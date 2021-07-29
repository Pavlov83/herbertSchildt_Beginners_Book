class Overload{

    //Two or more methods in the same class can share the same name
    //when this is the case the methods are oveloaded
    //This way java implements polymorphism.
    //In general we need to decalre different versions of the same method
    //The only restriction is that the methods should have different
    //type or number of parameters

    void ovlDemo(){
        System.out.println("No paramters");
    }

    //one integer parameter
    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    //two integer parameters
    int ovlDemo(int a, int b){
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    //ovlDemo for two double parameters
    double ovlDemo(double a,double b){
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }

}