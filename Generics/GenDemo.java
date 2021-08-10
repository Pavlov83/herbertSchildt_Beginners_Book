class GenDemo{

    public static void main(String args[]){
        //create gen reference for integers
        Gen<Integer>iOb;

        //create a Gen<Integer>object and assign its reference
        //if we want to encapsulate value of 89 in int object
         iOb = new Gen<Integer>(88);

         //show the datatype of iOb
         iOb.showType();

         //Get the value in iOb
         int v = iOb.getob();
         System.out.println("value" + v);


         //create a Gen object for strings
         Gen<String> strOb;

         //Show the type of data used by strOb
         strOb.showType();

         //Get the value of strOb
         //the no cast is needed
         String str = strOb.getob();
         System.out.println("value: " + str);
    }
}