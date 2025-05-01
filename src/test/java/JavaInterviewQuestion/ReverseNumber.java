package JavaInterviewQuestion;

import java.security.Principal;

public class ReverseNumber {


    public static void main(String[]args){
//1. way using string buffer
        int i =1234;

       StringBuffer reve = new StringBuffer(String.valueOf(i));

      String Revers= String.valueOf(reve.reverse());
      System.out.println(Integer.parseInt(Revers));
//2.using algorithm
     int num =3456;

     int rev=0;
     while(num!=0){
         rev=rev*10+num%10;
         num=num/10;
     }
      System.out.println("Reverse num is"+rev);

    }
}
