public class College{

    public static void main(String[] args){


        int month1 = 5;
        int month2 = 6;

        College obj = new College();

        obj.MECH(month1);  // arguments or parameters

        obj.MECH(month2);
        

    }

    public void MECH(int month){
        System.out.println(month + " MECH Symposiym has executed");
    }

   

}