/*
You are given N number of tiles and you are initially at kth position, you can only move to the next tile
(if you are not on the Nth tile) or to the previous one (if your not on the 1st tile). Your goal is to clean all 
the tiles. The tile you are initially at is already cleaned since you are standing on it. Every time you move to 
the next or previous tile move is incremented by 1. Now you have to find the minimum number of moves to clean 
all the tiles.

Input format:
You have to input T no. of testcases.
Next line contains N number of tiles and the Kth position of tile you are on.

Output format:
You have to output the minimum number of moves to clean all the tiles.

Sample Input:
2
4 3
3 2
6 2

Sample Output:
4
3
6
*/

public class Solution {
    static int tileCleaning(int n, int k) {
        //first we have a boolean ar with all values False except kth position which will be True 
        boolean[] ar = new boolean[n];
        k=k-1;
        for (int i=0;i<n;i++) {
            if (i==k) {
                ar[i] = true;
            }
            else {
                ar[i] = false;
            }
        }
        int moves=0,clean=1,mid;
        boolean direction;
        if (n%2==0)
            mid = n/2 - 1;
        else //or odd
            mid = n/2;
       //setting the initial direction based on our kth pos
        if (k<=mid)
            direction = false;
        else
            direction = true;
        //true for right; false for left
        while (clean != n)
        {
            if (k==n-1)
                direction = false;
            else if (k==0)
                direction = true;
            else
                direction = direction;
            
            if (direction==true) {
                k++;
                moves++;
            }
            else {    //else means when direction is false
                k--;
                moves++;
            }
    //for ar[k] = true we don't need to clean so we ignore

            if (ar[k]==false)
            {
                ar[k] = true;
                clean++;
            }
        }
    return moves;
    }
}
