/*
/*
Problem Statement: Find all the non-repeating elements for 
a given array. Outputs can be in any order.
Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in 
 the array. -1,2,3 occurs only once and hence, these are non-repeating
  elements of the given array.

Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating.
*/
import java.util.*;
public class Find_all_the_non_repeating_elements_in_an_array {
    public static void NonRepeatingE(int arr[]){
        int n = arr.length; 
        Arrays.sort(arr);
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr1[] = {1,2,-1,1,3,1};
        int arr2[] = {1,2,3};

        NonRepeatingE(arr1);
        NonRepeatingE(arr2);
    }
}
