package JavaInterviewQuestion;

public class ReverseStringQue {

    public static void main(String[]args){

        String name="Rakuten";
        String rev="";

        for(int i=0;i< name.length();i++){
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);

    }

}
