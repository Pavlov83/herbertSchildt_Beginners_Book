
    class Sup{
        void who(){
            System.out.println("Who() in Sup");
        }
    }

    class Sub1 extends Sup{
        void who(){
            System.out.println("who() in Sub1");
        }
    }

    class Sub2 extends Sup{
        void who(){
            System.out.println("who() in Sub2");
        }
    }

    class DynDispDemo{
        public static void main(String args[]){
            Sup superOb = new Sup();
            Sub1 subOb1 = new Sub1();
            Sub2 subOb2 = new Sub2();
            
            Sup supRef;

            supRef = superOb;
            supRef.who(); //in each version the who() is determined
                          // by the runtime object

            supRef = subOb1;
            supRef.who();

            supRef = subOb2;
            supRef.who();


        }
    }



