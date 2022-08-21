/*
THIS QUESTION WAS THERE IN IICC CODING NINJAS CONTEST.

You are given two binary strings 'A' and 'B'. Your task is to join these two strings in any order you want, then chack if
all the alternate characters of the string are equal or not. If all alternate characters are unequal then, return 1, else if
any of the alternate characters turn out to be equal then return 0.

Sample Input:
1010 1

Sample Output:
1

Explaination:
the resultant string can be 10101 or 11010.
For 10101 all the alternate charactersare unequal to each other.
Whereas for 11010, the 1st and 2nd characters are equal.
Since any one of these strings show the unequal possibility, so we return 1.

Note:-
Its upto you how you want to take input and print the output, but this is the core function of the program.
*/

public class Solution {
    static int goodNeighbours(String a, String b) {
        
        String c1 = a+b;
        String c2 = b+a;
        int n = c1.length();
        boolean first=true, second=true;
        for (int i=0;i<n-1;i++)
        {
            int j = i+1;
            if (c1.charAt(i) == c1.charAt(j))
                first = false;
            if (c2.charAt(i) == c2.charAt(j))
                second = false;
        }
        return (first||second) ? 1:0;
    }
}
