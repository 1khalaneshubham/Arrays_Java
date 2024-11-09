/*
Problem Statement: Given an unsorted array, 
find the median of the given array.

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5
*/
import java.util.*;
public class Find_Median_of_the_given_Array {
    public static double MedianOfArr(int arr[]){
        
        int n = arr.length;
        float Sum = 0;
        for(int i = 0; i<n; i++){
            Sum = Sum + arr[i];
        }
        return Sum/n;
    }
    public static void main(String[] args) {
        int arr1[] = {2,4,1,3,5};
        int arr2[] = {2,5,1,7};

        System.out.println(MedianOfArr(arr1));
        System.out.println(MedianOfArr(arr2));
    }
}
