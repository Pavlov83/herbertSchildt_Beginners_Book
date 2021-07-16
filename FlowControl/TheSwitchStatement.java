public class TheSwitchStatement {
    
    /*
    The switch works as the 
    value of expression is tested against constants:

    switch(expression){
        case constant1:
        statement sequence
        break;
        case constant2:
        statement sequence
        break;
        case constant3:
        statement sequence
        break;
        default:
        statement sequence;
    }
    */

    public static void main(String[] args){
        int i;

        for(i=0;i<6;i++){
            switch(i){
                case 0:
                System.out.println("i is zero");
                break;
                case 1:
                System.out.println(" i is one");
                break;
                case 2:
                System.out.println("i is two");
                break;
                case 3:
                System.out.println("i is three");
                break;
                case 4:
                System.out.println("i is four");
                break;
                case 5:
                System.out.println("i is five");
                break;
            default:
            System.out.println("i is five or more");
            }
        }
    }
}
