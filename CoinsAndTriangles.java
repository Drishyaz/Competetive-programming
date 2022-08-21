/*
Chef belongs to a very rich family which owns many gold mines. Today, he brought N gold coins and decided to form a
triangle using these coins. Chef has a unusual way of forming a triangle using gold coins, which is described as
follows:
He puts 1 coin in the 1st row,
then puts 2 coins in the 2nd row,
then puts 3 coins in the 3rd row, and so on.

Chef is interested in forming a triangle with maximum possible height using at most N coins.

For the Input, the first line is the no. of testcases 'T'. After that T lines follow, each line consists of 'N'
number of coins the chef has. For output, we have to fnd the maximum possible height of the triangle that Chef can get.

Sample Input:
3
3
5
7

Sample Output:
2
2
3
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CoinsAndTriangles
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for (int i=1;i<=t;i++) {
	        int coins = sc.nextInt();
	        int height = 0, rows = 1;
          //here 'rows' is the number of coins to be put in each row. It starts with 1 in the first row, and keep increasing.
        
          //until no. of coins is not equal to 0, we keep subtracting rows from coins
	        while (coins > 0) 
	        {
              //when we find that the remaining no. of coins is already less than 'rows', then it is not possible to
              //create a triangle with height > n. so without further decrementing we break out of the loop.
	            if (coins < rows)
	                break;
	            coins -= rows;
	            rows++;
	            height++;
	        }
	        System.out.println(height);
      }
	}
}
