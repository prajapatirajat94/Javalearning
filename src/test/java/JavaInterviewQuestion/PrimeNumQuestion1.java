package JavaInterviewQuestion;

public class PrimeNumQuestion1 {


    public static void main(String[] args) {

          getPrimeNumber(20);

    }

    public static boolean IsNumberPrime(int num){
if(num<1){
  return false;
    }
    for(int i =2;i<num;i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
    }

    public static void getPrimeNumber(int num){
     for(int i=2;i<=num;i++){
         if(IsNumberPrime(i)){
             System.out.print(i+" ");
         }

     }
    }
}



