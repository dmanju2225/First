package arraybased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestConsecutiveSeqUsingHashSet
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
List<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,8));
int consecutiveLength=longestConsecutiveSeqUsingHashSet(al);
System.out.println(consecutiveLength);
	}

	private static int longestConsecutiveSeqUsingHashSet(List<Integer> al)
	{
		// TODO Auto-generated method stub
		if(al.size()==0) return 0;
		if(al.size()==1)  return 1;
		int count=1;
		int n=al.size();
		int max=Integer.MIN_VALUE;
		HashSet<Integer> hs=new HashSet<Integer>();
		for (int i=0;i<n;i++){
			hs.add(al.get(i));
		}
		for(int i=0;i<n;i++){
			if(hs.contains(al.get(i)-1)){
				continue;
			}
			count=1;
			while(hs.contains(al.get(i)+count)){
			count++;
		     }
			if(count>max){
				max=count;
			}
		}
		return max;
	}

}
