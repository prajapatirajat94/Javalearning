package JavaInterviewQuestion;

public class Countnumberofdigit {



    public static void main(String[]args){

        int numd=123456789;
        int count=0;

        while (numd>0){
            numd=numd/10;
            count++;
        }
        System.out.println(count);
    }
}
