package arraybased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortAlgo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(2,3,5,0,1));
		
		quickSort(al,0,al.size()-1);
		System.out.println(al);

	}

	private static void quickSort(List<Integer> al, int start, int end)
	{
		// TODO Auto-generated method stub
	   if(start>=end) return;
		int partitionIndex=partition(al,start,end);
		
		quickSort(al,start,partitionIndex-1);
		quickSort(al,partitionIndex+1,end);
		
	}

	private static int partition(List<Integer> al, int start, int end)
	{
		// TODO Auto-generated method stub
		int lastIndex=end;
		int pivot=al.get(end);
		end--;
		while(start<=end){
			if(al.get(start)<pivot){
				start++;
			}
			else{
				int temp=al.get(end);
				al.set(end,al.get(start));
				al.set(start,temp);
				end--;
			}
		}
		int temp=al.get(start);
		al.set(start,pivot);
		al.set(lastIndex,temp);
		return start;
	}
	

}
