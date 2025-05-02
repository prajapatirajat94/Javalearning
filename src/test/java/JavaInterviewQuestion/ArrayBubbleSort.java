package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBubbleSort {

    public static void main(String[]args){

        Integer[]a ={4,6,5,8,3,1,2};
        System.out.println(Arrays.toString(a));
        int n=a.length;

        Arrays.parallelSort(a,Collections.reverseOrder());
//        for(int i=0;i<n-1;i++){
//            for(int j =0;j<n-1;j++){
//                if(a[j]>a[j+1]){
//                    int tem=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=tem;
//                }
//
//            }
//
//
//        }
        System.out.println(Arrays.toString(a));


    }
}
