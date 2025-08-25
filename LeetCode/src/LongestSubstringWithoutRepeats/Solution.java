package LongestSubstringWithoutRepeats;

/*
Given a string s, find the length of the longest substring without duplicate characters.


Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

import java.util.HashSet;
import java.util.Set;



public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
		
		Set<Character> seen = new HashSet<>();
		int left = 0;
		int maxLength = 0;
		
		for(int right = 0; right<s.length(); right++) {
			char current = s.charAt(right);
			
			while(seen.contains(current)) {
				seen.remove(s.charAt(left));
				left++;
			}
			
			seen.add(current);
			maxLength = Math.max(maxLength, right-left+1);
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String input1 = "abcabcbb";
		String input2 = "bbbbb";
        String input3 = "pwwkew";
        
        System.out.println("Input: " + input1 + " → Output: " + solution.lengthOfLongestSubstring(input1));
        System.out.println("Input: " + input2 + " → Output: " + solution.lengthOfLongestSubstring(input2));
        System.out.println("Input: " + input3 + " → Output: " + solution.lengthOfLongestSubstring(input3));
        
        
	}

}
