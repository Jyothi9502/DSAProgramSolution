package string;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LongestSubStringWithoutRepetition {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s = br.readLine();
			int len = longestSubstringLength(s);
			System.out.println(len);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int longestSubstringLength(String s) {
		
		String subStr = "";
		for(int i = 0; i < s.length();i++) {
			String temp = s.charAt(i)+"";
			for(int j = i+1; j < s.length(); j++) {
				String ch = s.charAt(j)+"";
				if(temp.contains((ch))) {
					if(temp.length() > subStr.length()) {
						subStr = temp;
					}
					break;
				}else {
					temp = temp+""+s.charAt(j);
				}
			}
			if(subStr.length() < temp.length()) {
				subStr = temp;
			}
		}
		
		
		return subStr.length();
	}
	

}
