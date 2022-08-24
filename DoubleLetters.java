/*
Print the number of the letters which have frequency exactly twice in the string.
Do the program without using any in-built functions.

Input: pool; Output: 1; Explaination: 'o' has frequency exactly 2, so no. of letters with that frequency = 1;
Input: malayalam; Output: 2
Input: statesman; Output: 3
*/

import java.util.Scanner;
public class Main
{
    public static char count(String s,char c) {
        int cnt=0;
        for (int i=0;i<s.length();i++)
            if (c==s.charAt(i))
                cnt++;
                
        if (cnt==2)
            return c;
        else
            return '0';
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    //input = "pool"
		String input = sc.nextLine();
		int l = input.length();
		String freq = "";
		
		for (int i=0;i<l;i++) {
		    char letter = count(input,input.charAt(i));
		    if (letter!='0')
		        freq += letter;
		}
		//freq = "oo"
		l = freq.length();
		System.out.println(l/2);
	}
}
