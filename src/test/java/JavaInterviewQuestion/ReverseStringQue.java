package JavaInterviewQuestion;

public class ReverseStringQue {

    public static void main(String[]args){
//1
        String name="Rakuten";
        String rev="";

        for(int i=0;i< name.length();i++){
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);


  //2
  String names ="Rajat";
  StringBuffer reverse = new StringBuffer(names);
  String Revstr=reverse.reverse().toString();
  System.out.println(Revstr);

    }

}
