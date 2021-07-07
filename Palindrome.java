package exerc;

import org.junit.Test;

/*
 * 1) Did i understand the problem? 
 *    Parameters
 *      -> What is the input for this problem? string
 *      -> What will be the output for this problem? int
 *      -> is there any constraints? consider only substring without duplicate characters
 *      -> Do i have all informants to go the next step? yes
 *      -> How big is the test data? small
 *      
 * 2) Test data set -yes
 *    -> Minimum of 3 data sets
 *    -> Positive, Negative and Edge case scenario
 *    -> Validate the test data with interviewer
 *    
 * 3) Do i know to solve it? - yes
 * 
 * 4) Ask for hint if don't know to solve? 
 * 
 * 5) Do i know any alternate solution? 
 *    -> No, Solve with the known solution
 *    
 * 6) If alternate solution found -> Find the O notation 
 *     -> Explain either or the best one depends on time
 *     -> Approach 01 : Starts with worst(Brute force)
 *     -> Approach 02: Write the options and benefits of it 
 *     -> Always start from worst to best
 *     
 * 7) Proceed with pseudocode 
 * 
 * 8) Implement code in editor
 * 
 * 9) Test against data set
 * 
 * 10) Debug if it fails    
 */

public class Palindrome {
	
	
	/*get the integer, reverse a number and reversed number and integer value should be the same
	 * to reverse a number get the value and use below logic
	 * get last digit, to get the second to the last digit, remove the last digit from integer
	 * value  % 10  to get last digit
	 * value / 10, to remove the last digit
	 *  multiply the last digit by 10 and add the second last digit,
	 *  repeat it till the last digit  
	 */
	@Test
	public void example1()
	{
		int nums = 171;
		Palindromevalue(nums);
	}
	
	@Test
	public void example2()
	{
		int nums = 144;
		Palindromevalue(nums);
	}
	
	@Test
	public void example3()
	{
		int nums = -11;
		Palindromevalue(nums);
	}
	@Test
	public void example4()
	{
		int nums = 20;
		Palindromevalue(nums);
	}
	
	
	
	public boolean Palindromevalue(int value) {
	      int num = 0,temp = value;
	      while(value>0){
	              num = num*10 + value%10;
	              value = value/10;
	            }
	      if(temp == num){
	        return true;
	      }
	      return false;
	    }

}
