/*Input Format
The first and only line of input contains two space-separated integers X and Y — the count of 'All problems' in the Beginner's section and the count of Chef's 'Attempted' problems, respectively.

Output Format
Output a single integer in a single line — the number of problems that are yet 'Un-attempted'

Constraints
1≤Y≤X≤1000

Subtasks
Subtask 1 (100 points):
Original constraints.

Sample Input 1 
10 4
Sample Output 1 
6

Sample Input 2 
10 10
Sample Output 2 
0

Sample Input 3 
1000 990
Sample Output 3 
10

Sample Input 4 
500 1
Sample Output 4 
499

Explanation
Test case 1: There are 10 problems in total in the Beginner's section, out of which 4 have been attempted. Hence, there are 6 Un-attempted problems.

Test case 2: There are 10 problems in total in the Beginner's section, out of which all have been attempted. Hence, there are 0 Un-attempted problems.

Test case 3: There are 1000 problems in total in the Beginner's section, out of which 990 have been attempted. Hence, there are 10 Un-attempted problems.

Test case 4: There are 500 problems in total in the Beginner's section, out of which only 1 has been attempted. Hence, there are 499 Un-attempted problems.*/


//**SOLUTION**//

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int a,b;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println(a-b);
	}
}
