package exerc;

import org.junit.Test;

public class Majorityelement {
	
	

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


	
	//couunt the majorityelemt by using n/2;
	//count each element 
	//if count value is equal or greater than majoritycount then return true else return false
	@Test 
	public void example1()
	{
		int[] numbers = {1,2,4,5,2,2,2,2,2};
		System.out.println(""+majorityElement(numbers));
	}
	
	@Test 
	public void example2()
	{
		int[] numbers = {1,2,4,5};
		System.out.println(""+majorityElement(numbers));
	}
	
	@Test 
	public void example3()
	{
		int[] numbers = {1,2,4,5,4,4,4,4,1,4,};
		System.out.println(""+majorityElement(numbers));
	}
	
	
	public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1; //o(n)
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;    
    }

}
