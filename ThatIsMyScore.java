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
		    int n = sc.nextInt();   //submissions
		    int[] questions = new int[11];
		    for (int i=0;i<11;i++)
		        questions[i] = 0;
		        
		    for(int i=1;i<=n;i++)
		    {
		        int p = sc.nextInt();
		        int s = sc.nextInt();
		        if (s > questions[p-1])
		            questions[p-1] = s;
		    }
		    
		    int sum = 0;
		    for (int i=0;i<8;i++)
		        sum += questions[i];
		        
		    System.out.println(sum);
		}
	}
}
