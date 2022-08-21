/*
THIS QUESTION CAME IN IICC CODING NINJAS CONTEST 2022

First line of input is 'N', which is the sixe of the array 'AR'. Next line contains the array elements. Your task is to
reduce all the elements of the array to 0, using the following formula. And then return the minimum number of operations
that were needed to reduce all the elements to 0.

If the array element is even, replace the element i with i/2.
If the array element is odd, replace the element i with (i-1)/2.

Sample Input:
5
2 5 6 3 1

Sample Output:
11

Note:-
It is upto you how you write the code for input and ouput, but this is the core function of the program.
*/

public class Solution {
    static int allZeros(int[] a) {
        int flag=1;
        for (int i=0;i<a.length;i++) {
            if (a[i]!=0) {
                flag = 0;    //return false for all a[i] != 0
                break;
            }
        }
        //flag = 1;    //return true when all a[i] == 0
        return flag;
    }
    static int reduceArray(int []a) {
        int op=0;
        while (allZeros(a) != 1) {
            for(int i=0;i<a.length;i++) {
                if (a[i] == 0)
                    continue;
                if (a[i]%2==0) {
                    a[i] = a[i]/2;
                    op++;
                }
                else {
                    a[i] = (a[i]-1)/2;
                    op++;
                }
            }
        }
        return op;
    }
}
