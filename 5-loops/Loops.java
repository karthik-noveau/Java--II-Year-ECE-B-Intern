public class Loops{
    public static void main(String[] args){


    //  System.out.println("this is Java Session");
    //  System.out.println("this is Java Session");
    //  System.out.println("this is Java Session");
    //  System.out.println("this is Java Session");
    //  System.out.println("this is Java Session");
    //  System.out.println("this is Java Session");


//-----------for loop----------

          for( int i=1; i<=5 ; i++ ){ 

            System.out.println(i);
             
          }

//-----------while loop----------

        int num = 50; // 0
          while( num>0 )
          {  // 50>0 , 5>0 , 0>0
            num= num/10;  // 50/10 = 5, 5/10=0
            System.out.println(" while loop value : "+num);
          }


//-----------do while loop----------

          int num2 = 50;
           do{
               num2= num2/10;  // 50/10 = 5, 5/10=0
               System.out.println("Do while loop value : "+num2);
           }

          while(num2>0 );
          



    }
}  