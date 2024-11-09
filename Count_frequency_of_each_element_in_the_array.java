/*
Problem statement: Given an array, we have 
found the number of occurrences of each element in the array.
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
5  2
15  1
Explanation: 10 occurs 3 times in the array
5 occurs 2 times in the array
15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
3  1
4  2
Explanation: 2 occurs 3 times in the array
3 occurs 1 time in the array
4 occurs 2 time in the array

*/
import java.util.*;
public class Count_frequency_of_each_element_in_the_array {
    public static void CountFrequency(int arr[],int n){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i= 0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+ " -> " +entry.getValue());
        }
    }
    public static void main(String args[]){
        // int arr1[] = {10,5,10,15,10,5};
        // int n = arr1.length;
        // CountFrequency(arr1, n);
        int arr2[] = {2,2,3,4,4,2};;
        int n = arr2.length;
        CountFrequency(arr2, n);
    }
}
