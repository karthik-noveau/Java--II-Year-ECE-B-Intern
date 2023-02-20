public class Arrays{
    public static void main(String[] args){


        //--------------primitive data type---------------
        int a = 60; 

        //-------------Non-primitive data type------------


        //-------------Way 1------------
        int numbers[] = new int[]{10,20,30,40,50};  // length : 5

        //-------------Way 2 ------------
        int ages[] = new int[2];

        ages[0] = 12;
        ages[1] = 50;
        System.out.println(ages[0]);

        System.out.println("array length is " + numbers.length );


        for(int i=0; i<5; i++){  // scope or block
             System.out.println( numbers[i]+2 ); // 10+2=12 , 20+2
        }
                           
       


    }
}