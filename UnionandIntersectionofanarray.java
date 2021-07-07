package exerc;
import java.util.*;
import java.util.Map.Entry;

import org.junit.*;
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

public class UnionandIntersectionofanarray {
	
	@Test 
	public void example()
	{
		int[] a = {1, 3, 4, 5, 7};
        int[] b= {2, 3, 5, 6} ;		
        Assert.assertEquals(new int[]{3,5}, intersection(a, b));
		
	}
	
	
	
	public int [] intersection(int[] a, int[] b)
	{
		
		
		HashSet<Integer> sets1 =  new HashSet<Integer>();
		for(int i : a)
		{
			sets1.add(i);
		}
		
		HashSet<Integer> intersections =  new HashSet<Integer>();
		for(int i : b)
		{
			if(sets1.contains(i)) {
				intersections.add(i);
		}}
		int[] result =new int[intersections.size()];
		int index= 0;
		for(int i :intersections)
		{
			 result[index] =i;
			index++;
			
		}
		return result;
	}
	
		

}
