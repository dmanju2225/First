package arraybased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1, 0, 2, 2, 5));
		ArrayList<List<Integer>> al = split(b);
		if (al.size() == 2)
		{
			System.out.println(al.get(0).toString()+" "+al.get(1).toString());
		}
	}

	private static ArrayList<List<Integer>> split(ArrayList<Integer> b)
	{
		// TODO Auto-generated method stub
		int flag = 0;
		ArrayList<List<Integer>> al = new ArrayList<List<Integer>>();
		int totalSum = 0;
		int n = b.size();
		for (int i = 0; i < n; i++)
		{
			totalSum = totalSum + b.get(i);
		}
		if (totalSum % 2 != 0)
		{
			return al;
		}
		int halfSum = totalSum / 2;
		int sum = 0;
		int i = 0;
		for (i = 0; i < n; i++)
		{
			sum = sum + b.get(i);
			if (sum == halfSum)
			{
				flag = 1;
				break;
			}
			// Collections.addAll(al,x);
			// Collections.addAll(al,y);

		}
		if (flag == 1)
		{
			List<Integer> x = new ArrayList<Integer>();
			List<Integer> y = new ArrayList<Integer>();

			x = b.subList(0, i + 1); // x=Arrays.copyOfRange(b,0,i) 0 &i both are inclusive
//0 inclusive,i+1 exclusive
			y = b.subList(i + 1, n); // y=Arrays.copyOfRange(b,i+1,n-1)

			al.add(x);
			al.add(y);
			return al;
		}
		return al;
	}
}
