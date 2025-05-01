package JavaInterviewQuestion;

public class FindMissingNumber {

    public static void main(String[]args){

        int[]Numbers={1,2,4,5,6,7};
        System.out.println(MissNumber(Numbers,7));


    }
    public static Integer MissNumber(int[]Mn,int totalnum){

        int expectedVlaue=totalnum*((totalnum+1)/2);
        int ActVlaue=0;
        for(int i:Mn){
            ActVlaue+=i;
        }
        return expectedVlaue-ActVlaue;
    }

}
