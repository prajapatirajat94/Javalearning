package JavaInterviewQuestion;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] Numbers = {1, 2, 3, 5, 6, 7};
        System.out.println(MissNumber(Numbers, 7));


    }

    public static Integer MissNumber(int[] Mn, int totalnum) {
        int ExpectedValue=totalnum*((totalnum+1)/2);
    int ActValue =0;
       for(int i:Mn){
              ActValue+=i;

}
       return ExpectedValue-ActValue;
    }
}