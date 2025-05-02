package JavaInterviewQuestion;

public class CountnumberofEvenOddnum {

    public static void main(String[]args) {
        int num = 123456;

        while(num > 0) {
            int numbercheck = num%10;
            if(numbercheck%2==0){
                System.out.println(numbercheck + " Number is even");
            }else {
                System.out.println(numbercheck + " Number is ODD");
            }
            num=num/10;

        }
    }




}
