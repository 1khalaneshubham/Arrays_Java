/*
Problem Statement: Rearrange the array such that the first half is arranged in increasing order, 
and the second half is arranged in decreasing order
Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
*/
import java.util.*;
public class Rearrange_array_in_increasing_decreasing_order {
    public static void RearrangeImIncreasingDecreasingorder(int arr[],int n){
        Arrays.sort(arr);

        for(int i = 0; i<(n/2); i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = n-1; i>=(n/2); i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr1[] = {8,7,1,6,5,9};
        // int n = arr1.length;

        // RearrangeImIncreasingDecreasingorder(arr1,n);
        
        int arr2[] = {4,2,8,6,15,5,9,20};
        int n = arr2.length;
        RearrangeImIncreasingDecreasingorder(arr2,n);
    }
}
