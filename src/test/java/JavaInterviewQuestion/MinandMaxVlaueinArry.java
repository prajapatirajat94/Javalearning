package JavaInterviewQuestion;

public class MinandMaxVlaueinArry {

    public static void main(String[]args) {


        int []a={50,30,90,10,90,10,70,1};
        int max =a[0];
//1.Max value
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("Max value from array is : "+max);
//2.Min value
int min =a[0];
for(int i =0;i<a.length;i++){
    if(a[i]<min){
        min=a[i];
    }
}
        System.out.println("Min value from array is : "+min);



    }








}
