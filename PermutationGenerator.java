/**
 * 	Class PermutationGenerator  
 * 	Created by Dehao Wang, 11.09.14 
 */
public class permutationGenerator 
{
	private String word;
	
	// Constructor
	public permutationGenerator(String aWord)
	{
		word = aWord;
	}
	
	// Method to get the number of permutations: n!
	public int getNumber(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		else
		{
			return n * getNumber(n-1);
		}
	}
	
	// Method to get all the permutations of a given string
	public String [] getPermutations(String aWord)
	{
		int perNumber = aWord.length();
		
		// basic condition
		String [] permutations = new String[getNumber(perNumber)];
		if(perNumber == 1)
		{
			permutations[0] = aWord;
			return permutations;
		}
		int index = 0;
		
		// loop i to get all the possible first characters
		for(int i = 0; i < perNumber; i++)
		{
			// get the shorter word
			String shorterWord = aWord.substring(0, i) + aWord.substring(i+1);
			
			// recursively get all the permutations of the shorter word 
			for(String s : getPermutations(shorterWord))
			{
				// string concatenation
				permutations[index] = aWord.charAt(i) + s;
				index++;
			}
		}
		return permutations;
	}
	
	// print all permutations
	public void printPermutations()
	{
		for(String s : getPermutations(word))
		{
			System.out.println(s);
		}
	}
}
