/*
Problem Statement: Given an unsorted array, remove duplicates from the array.

Examples:

Example 1:
Input: arr[]={2,3,1,9,3,1,3,9}
Output:  {2,3,1,9}

Explanation: Removed all the duplicate elements

Example 2:
Input: arr[]={4,3,9,2,4,1,10,89,34}
Output: {3,4,9,2,1,10,34,89}
Explanation: Removed all the duplicate elements
*/
import java.util.*;
public class Remove_Duplicates_From_an_Unsorted_Array {
    public static void RemoveDuplicatesUnsortedArr(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                map.put(arr[i],1);
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr1[]={2,3,1,9,3,1,3,9};
        int arr2[]={4,3,9,2,4,1,10,89,34};
        
        // Arrays.sort(arr1);  if you need to Sort than sort it
        RemoveDuplicatesUnsortedArr(arr1);
        // Arrays.sort(arr2);
        RemoveDuplicatesUnsortedArr(arr2);
    }
}
