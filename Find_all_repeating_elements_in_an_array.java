/*
Problem Statement: Find all the repeating elements present in an array.

Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
1,2,4
Explanation:
1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
Arr[] = [1,1,0]
Output:
1
Explanation:
Only 1 is occurring more than once in the given array.
*/
import java.util.*;
public class Find_all_repeating_elements_in_an_array {
    public static void IsRepeatingE(int arr[]){
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr1[] = {1,1,2,3,4,4,5,2};
        int arr2[] = {1,1,0};

        IsRepeatingE(arr1);
        IsRepeatingE(arr2);

    } 
}
