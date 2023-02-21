public class College{

    public static void main(String[] args){

        int month = 5;

        College obj1 = new College();
        obj1.MECH();
        obj1.MECH();
        obj1.MECH();


        ECE();
        ECE();
        ECE();

        System.out.println(obj1.add);

    }


    int add = 10;  // instance variable

    public void MECH(){ // instance method
        System.out.println( " MECH Symposiym has executed");
    }

    public static void ECE(){  // instance method
        System.out.println( " ECE Symposiym has executed");
    }

}



//