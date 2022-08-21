/*
You are participating in a contest which has 11 problems (numbered 1 through 11). The first eight problems
(i.e. problems 1, 2,..8) are scorable, while the last three problems (9,10 and 11) are non-scorable ― this means
that any submissions you make on any of these problems do not affect your total score.
Your total score is the sum of your best scores for all scorable problems.

For Input, first line is the number of test cases 'T', second line is 'N' which is the number of problems you have solved.
Then after N, nth lines follow, which consists of two inputs 'P' and 'S' denoting that your n-th submission was on problem 'P'
and it received a score 'S' on problem 'P'. For each testcase, the output is the total score.

Sample Input:
2
5
2 45
9 100
8 0
2 15
8 90
1
11 1

Sample Output:
135
0
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ThatIsMyScore
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
		    int n = sc.nextInt();   //n = no. of problems submitted or solved
		    int[] questions = new int[11];
		    for (int i=0;i<11;i++)
		        questions[i] = 0;
			//initially we set all the scores to 0
		        
		    for(int i=1;i<=n;i++)
		    {
		        int p = sc.nextInt();
		        int s = sc.nextInt();
			//everytime before inputting the scores we check if the new score is more than the existing one
			//if true, then we update the existing score with the new maximum, else if false, we do nothing.
		        if (s > questions[p-1])
		            questions[p-1] = s;
			    //we update the score in the (p-1)th position of the questions array.
			    //the scores we did not obtain remain 0 .
		    }
		    
		    int sum = 0;
		    for (int i=0;i<8;i++)
		        sum += questions[i];
			//after we are done getting all the scores, we add them all.
			//but we add the scores only till problem 8 because the rest are unscorable so we ignore them. 
		        
		    System.out.println(sum);
		}
	}
}
