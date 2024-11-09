/*
Problem Statement: Given an array of N integers, write a program to 
add an array element at the beginning, end, and at a specific position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at 
the end and 8 is added at position 4 
*/
import java.util.*;
public class Adding_Element_in_an_Array {
    public static void AddFirst(List<Integer>list, int E){
        list.add(0,E);
    }
    public static void AddEnd(List<Integer>list, int E){
        list.add(E);
    }
    public static void AddAtPostion(List<Integer>list,int P,int E){
        if(P >= 0 && P <= list.size()){
            list.add(P,E);
        }else{
            System.out.println("Invalid position: "+P);
        }
    }
    public static void main(String args[]){
        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("Original List"+list);
        
        AddFirst(list,9);
        System.out.println(list);

        AddEnd(list, 222);
        System.out.println(list);

        AddAtPostion(list, 4, 999);
        System.out.println(list);
    }
}
