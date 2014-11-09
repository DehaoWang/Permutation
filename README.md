Permutation
===========

Permutations are the possible sequences of some objects in a set. For example, the permutations of the object set{1,2,3} are (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2) and (3,2,1). 

Assuming that all the objects are distinct in the set, it can be calculated that the number of the permutations is n! where n is the number of the distinct objects.

To get the permutations of a string, this practice proposes a solution using a recursive method. 
Permutation generator:

The basic condition occurs when there is only one character in the string.

If the string has n characters, (Loop 'i' from 0 to n-1) the method takes the 'i'th as the first character and generate the rest according to the permutations of the "shorter string" (a string obtained by subtracting the 'i'th character from the original one).
