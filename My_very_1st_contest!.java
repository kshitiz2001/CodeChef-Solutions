/*Input Format
Each input file contains of a single line, with three integers N,A and B - the number of new users, the number of users who just saw the problem and didn't make any submission, and the number of users who made a submission but could not solve any problem correctly.

Output Format
Output two integers separated by a space in a single line - the number of new users who will get a rating at the end of the contest and the number of new users who will get a rating higher than 1000.

Constraints
2≤N≤1000
1≤A≤1000
1≤B≤1000
A+B≤N

Sample Input 1 
10 3 2
Sample Output 1 
7 5

Explanation
There were 10 new users. Among those 10, 3 didn't make any submissions. This means that the other 10−3=7 users made submissions and will get a rating. This is the first integer of the output.
Now, among these 7 users, 2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 1000. The other 7−2=5 users were able to solve at least 1 problem and hence will get a rating greater than 1000. Hence, the second integer of the output is 5.

Sample Input 2 
10 4 1
Sample Output 2 
6 5

Explanation
There were 10 new users. Among those 10, 4 didn't make any submissions. This means that the other 10−4=6 users made submissions and will get a rating. This is the first integer of the output.
Now, among these 6 users, 1 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 1000. The other 6−1=5 users were able to solve at least 1 problem and hence will get a rating greater than 1000. Hence, the second integer of the output is 5.

Sample Input 3 
20 1 2
Sample Output 3 
19 17

Explanation
There were 20 new users. Among those 20, 1 didn't make any submissions. This means that the other 20−1=19 users made submissions and will get a rating. This is the first integer of the output.
Now, among these 19 users, 2 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 1000. The other 19−2=17 users were able to solve at least 1 problem and hence will get a rating greater than 1000. Hence, the second integer of the output is 17.

Sample Input 4 
1000 300 700
Sample Output 4 
700 0

Explanation
There were 1000 new users. Among those 1000, 300 didn't make any submissions. This means that the other 1000−300=700 users made submissions and will get a rating. This is the first integer of the output.
Now, among these 700 users, 700 couldn't solve any problem even though they submitted and tried. So, they will get a rating less than equal to 1000. The other 700−700=0 users were able to solve at least 1 problem and hence will get a rating greater than 1000. Hence, the second integer of the output is 0.*/


//**SOLUTION**//

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		int userSub = N - A;
		int userRate1000 = N - A - B;
		System.out.println(userSub);
		System.out.println(userRate1000);
	}
}
