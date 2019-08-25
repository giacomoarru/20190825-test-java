import java.util.Arrays;

public class Solution4 {

	public static void main(String[] args) {
		int[] input = new int[]{-75767,-65,7,1,3,2,88};
		int output = solution(input);
		System.out.println(output);
	}

	/*
	Write a function:

	    class Solution { public int solution(int[] A); }

	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

	Given A = [1, 2, 3], the function should return 4.

	Given A = [−1, −3], the function should return 1.

	Write an efficient algorithm for the following assumptions:

	        N is an integer within the range [1..100,000];
	        each element of array A is an integer within the range [−1,000,000..1,000,000].
	 */


	public static int solution(int[] A) {
		Arrays.sort(A);
		int val = 1;
		int len = A.length;

		for (int i = 0; i < len; i++) {
			if(A[i] == val) {
				val++;
			}
		}
		return val;
	}
}
