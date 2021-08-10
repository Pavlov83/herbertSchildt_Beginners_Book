//A simple geneir class,T is a type parameter that will be replaced by
//real type when an object of type Gen is created

class Gen<T>{
    T ob;//decalre an object of type T

    //pass the constructor  reference to an object of type T.

    Gen(T o){
        ob = o;
    }

    //Return ob.
    T getob(){
        return ob;
    }

    //Show type of T
    void showType(){
        System.out.println("Type of T is" + ob.getClass().getName());
    }

    
    
}