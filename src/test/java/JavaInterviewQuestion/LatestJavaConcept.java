package JavaInterviewQuestion;

import java.util.HashMap;

public class LatestJavaConcept {

    public static void main(String[]args){

        HashMap<String ,Integer>ClientData=new HashMap<>();
        ClientData.put("Rajat",26);
        ClientData.put("Kajol",27);
        ClientData.put("Kamal",28);

        ClientData.forEach((K,V)->System.out.println("Client name is : "+K+" and " +
                "Client Age is : "+V));

        System.out.println(ClientData.getOrDefault("rr",0));

        String []words ={"My","name","is","Rajat"};
        StringBuilder sentences = new StringBuilder();
        for(String word:words){
            sentences.append(word).append(" ");
        }
        System.out.println(sentences);


    }




}
