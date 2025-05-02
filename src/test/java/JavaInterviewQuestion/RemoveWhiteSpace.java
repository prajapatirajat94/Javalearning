package JavaInterviewQuestion;

public class RemoveWhiteSpace {


    public static void main(String[]args){


        String str ="Java    My   Language ";
        str=str.replaceAll("\\s","");
        System.out.println(str);
        //count occurance of character
        String str2="Java is My Language";

        System.out.println(str2.replaceAll("[^a]","").length());

String[]str3=str2.split(" ");
System.out.println(str3.length);





    }





}
