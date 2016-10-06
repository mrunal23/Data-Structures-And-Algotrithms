/**
 * 
 */
package com.algo.recursion;

/**
 * @author mrule
 *
 */
public class ReverseWords {

	public static void reverseWords(String str,StringBuilder buffer, String temp, int length){
		
		System.out.println("in reverse word function...");
				
		if(length < 0){
			buffer.append(reverse(temp));
			temp = "";
			System.out.println("buffer is " + buffer);
			return;
		}
		else{
			System.out.println(str.charAt(length));
			if(str.charAt(length)==' '){
				buffer.append(reverse(temp)+" ");
				temp = "";
			}else{
				temp += str.charAt(length);
			}
			
			reverseWords(str, buffer, temp, --length);		
		}
	}
	
	public static String reverse(String str){
		String revStr = "";
		
		for(int i=str.length()-1;i>=0;i--){
			revStr += str.charAt(i);
		}
		return revStr;
	}
}
