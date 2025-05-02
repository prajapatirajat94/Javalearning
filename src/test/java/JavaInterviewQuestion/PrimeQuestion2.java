package JavaInterviewQuestion;

public class PrimeQuestion2 {

    public static void main(String[] args) {
        GetPrimeNumbers(100);


    }

    public static void GetPrimeNumbers(int num) {

        for(int i=1;i<=num;i++){
            int count =0;
            for(int j =1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }


    }

    public static void GetPrimeNumber(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println(num +" Number is Prime");
        } else {
            System.out.println(num +" Number is not Prime");
        }


    }
}




