/**
 * 
 */
package com.algo.recursion;

/**
 * @author mrule
 *
 */
public class RecursionApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStr = "to do or not";
		StringBuilder buffer = new StringBuilder();
		ReverseWords.reverseWords(originalStr, buffer, "",originalStr.length()-1);
		System.out.println("the reverse string is " + buffer);
		combine("abc",new StringBuffer(),0);
	}

	public static void combine(String instr, StringBuffer outstr, int index)
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	    	System.out.print("index is " + index + " i is " + i);
	        outstr.append(instr.charAt(i));
	        System.out.println(outstr);
	        combine(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);
	    }
	} 

	
}
