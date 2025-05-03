package JavaInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateWordCount {



    public static void main(String[]args){
      FindRepetativeWord("This is Just Test. Which Run Test");



    }
    public static void FindRepetativeWord(String Sentences){
        String[]words=Sentences.toLowerCase().split(" ");
        Map<String,Integer>wordcount=new HashMap<>();

        for(String word :words){
            word=word.replaceAll("[.,!?]","");
            wordcount.put(word,wordcount.getOrDefault(word,0)+1);

        }
        for(Map.Entry<String,Integer>entry:wordcount.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }



    }

}
