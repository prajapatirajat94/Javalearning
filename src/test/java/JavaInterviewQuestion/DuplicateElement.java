package JavaInterviewQuestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {


    public static void main(String[]args){


        String[]names={"Rajat","Kajol","Kamal","Kajol","Rajat"};
        Set<String>nameSet=new HashSet<>();
        for(String name:names){

            if(!nameSet.add(name)){
                System.out.println("Duplicate element value is : "+name);
            }
        }

    }




}
