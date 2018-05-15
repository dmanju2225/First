package arraybased;

public class SplitArrayUsingSubsets
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          int[] a={1, 2, -3,-4};
           int n=a.length;
          boolean b=isPartition(a,n);
          System.out.println(b);
	}

	private static boolean isPartition(int[] a, int n)
	{
		// TODO Auto-generated method stub
		int totalSum=0;
		for(int i=0;i<n;i++){
			totalSum=totalSum+a[i];
		}
		if(totalSum%2!=0) return false;
		int halfSum=totalSum/2;
		
		return isSubsetPossible(a,n,halfSum);
	}

	private static boolean isSubsetPossible(int[] a, int n, int Sum)
	{
		// TODO Auto-generated method stub
		if(Sum==0) return true;
		if(n==0&&Sum!=0) return false;
		if(a[n-1]>Sum){
			return isSubsetPossible(a,n-1,Sum);
		}
		return isSubsetPossible(a,n-1,Sum)||isSubsetPossible(a,n-1,Sum-a[n-1]);	
	}
}
