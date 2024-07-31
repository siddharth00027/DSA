// Longest Common Prefix of Strings

// Given an array of strings arr. Return the longest common prefix among all strings present in the array. If there's no prefix common in all the strings, return "-1".

// Examples :

// Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
// Output: gee
// Explanation: "gee" is the longest common prefix in all the given strings.
// Input: arr[] = ["hello", "world"]
// Output: -1
// Explanation: There's no common prefix in the given strings.
// Expected Time Complexity: O(n*min(|arri|))
// Expected Space Complexity: O(min(|arri|))

// Constraints:
// 1 ≤ |arr| ≤ 103
// 1 ≤ |arr[i]| ≤ 103
import java.util.*;
class Solution {
    public String longestCommonPrefix(String arr[]) {
        
        // code here
        Arrays.sort(arr);
        
        String s1=arr[0];
        String s2=arr[arr.length-1];
        int i=0;
        for( ;i<s1.length() && i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
        }
        if(i==0){
            return "-1";
        }
        
        return s1.substring(0,i);
        
    }
}