/*
Problem Statement: Given an array,
we have to find the sum of all the elements in the array.

Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 15
Explanation: Sum of all the elements is 1+2+3+4+5 = 15

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 11
Explanation: Sum of all the elements is 1+2+1+1+5+1 = 11
*/
import java.util.*;
import java.util.stream.IntStream;
public class Calculate_Sum_of_the_Elements_of_the_Array {
    public static int SumOfArr(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,1,1,5,1};
        int arr3[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Output:"+SumOfArr(arr1));
        System.out.println("Output:"+SumOfArr(arr2));

        int Sum = IntStream.of(arr3).sum();
        System.out.println("Output:"+(Sum));
    }
}
