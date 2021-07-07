package exerc;

import java.util.Arrays;

import org.junit.Assert;
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


/*pseudo code
 * check value plus difference is equal to next element
 * if its equals to next element then continue 
 * if not return missed element
 * 
 */

public class MissingnumberDistinctarray {

 
	@Test 
	public void example()
	{
		int[] numbers = {1,2,4,5};
		System.out.println(""+missingNumber(numbers));
	}
	
	@Test
	public void example2()
	{
		int[] numbers = {7,8,9,10};
		System.out.println(""+missingNumber(numbers));
		
	}
	 public int missingNumber(int[] nums)
	 {		
		 int i;
		Arrays.sort(nums);
		    for(i=0; i < nums.length- 1; i++)
		    {
		        if(nums[i]+1 != nums[i+1])		        
		       
		        	System.out.println(nums[i]+1);
		       
		     
		    
		}
		    return nums[i]+1;
	 }
}
