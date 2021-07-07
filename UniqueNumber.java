package exerc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
public class UniqueNumber {

	@Test
	public void example1()
	{
		int[] nums = {2,2,7,11,15};
		UniqueNumber1(nums);
	}
	
	@Test
	public void example2()
	{
		int[] nums = {2,1,8,7,8,4,};
		UniqueNumber1(nums);
	}
	
	@Test
	public void example3()
	{
		int[] nums = {9,9,8,8};
		UniqueNumber1(nums);		
	}
	
	//brouteforce 
	
	public boolean UniqueBrouteforce(int[] nums)
	{
		Arrays.sort(nums);
		for(int i = nums.length-1; i >= 0;i++)
		{
			if(nums[i]!=nums[i-1])
			{
				System.out.println(nums[i]);
			}
			while(i>0&&nums[i]==nums[i-1])
			{
				i--;
			}
		}
		
		
		return true;
	}
	
	
	//Hashmp
	
	 public boolean UniqueNumber1(int[] A) {
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	       for(int i = 0; i<A.length; i++){
	           if(hmap.containsKey(A[i])){
	               hmap.put(A[i], hmap.get(A[i])+1);
	           }else{
	               hmap.put(A[i], 1);
	           }
	       }
	        int max = -1;
	        for(int key : hmap.keySet()){
	            if(hmap.get(key) == 1){
	               System.out.println(key);
	            }
	        }
	        return true;
	    }
}
