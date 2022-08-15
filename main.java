package package1;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Order the following numbers in an increasing order");
        int [] numbers={3,6,1,3,91,345,123,5,6,8,12,45,124,61};
        System.out.println(Arrays.toString(math(numbers)));

    }
    public static int[] math(int[]arr){
        int temp;

        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
// a program to sort out numbers on a given array in an increasing order 
