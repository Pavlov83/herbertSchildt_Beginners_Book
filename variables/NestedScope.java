public class NestedScope {
    
    public static void main(String[] args){
        int x = 10;
        if(x == 10){ //starts scope

            int y = 20;//available only in the code block
            //x and y are available here
            System.out.println("x and y" + x + " " + y);
            x = y * 2;

        }

        //y = 200; -gives an error, not available outside of the scope
        //x is still available as it is in the same scope
        System.out.println("x is " + x);
    }
}
