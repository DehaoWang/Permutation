/**
 * 	Class Test: instantiation of the generator and test the sample string "abcd"  
 * 	Created by Dehao Wang, 11.09.14 
 */
public class Test{

	public static void main(String[] args) 
	{
		String testStr = "abcd";
		
		PermutationGenerator testPG = new PermutationGenerator(testStr);

		testPG.printPermutations();
	}
}
