package arraybased;

import java.util.Arrays;

public class LongestConsecutiveSeq
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 10, 2, 3, 4, 6, 11 };
		int len = longestConsecutive(a);
		System.out.println(len);
	}

	private static int longestConsecutive(int[] a)
	{
		// TODO Auto-generated method stub
		int currLen = 1;
		int maxLen = Integer.MIN_VALUE;
		Arrays.sort(a);
		// System.out.println(a[8]);
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
		{

			if (a[i + 1] == a[i] + 1)
			{
				currLen++;
				if (currLen > maxLen)
				{
					maxLen = currLen;
				}
			}
			else
			{
				currLen = 1;
				continue;
			}
		}
		return maxLen;
	}
}
