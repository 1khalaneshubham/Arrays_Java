/*
Problem Statement: Given an array, 
we have to find the average of all the elements in the array.
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 3
Explanation: Average is the sum of all the elements divided by 
number of elements.Therefore (1+2+3+4+5)/5 = 3.

Example 2:
Input:  N=6, array[] = {1,2,1,1,5,1}
Output: 1.8
Explanation: Average is the sum of all the elements divided by
 number of elements.Therefore (1+2+1+1+5+1)/6 = 1.8
*/
import java.util.*;
public class Average_of_All_Elements{
    public static double AverageOfArr(int arr[]){
        int n = arr.length;
        float Sum = 0;
        for(int i = 0; i<n; i++){
            Sum = Sum  + arr[i];
        }
        return Sum/n;
    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,1,1,5,1};

        System.out.println("Output:"+AverageOfArr(arr1));
        System.out.println("Output:"+AverageOfArr(arr2));
    }
}
