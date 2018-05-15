package arraybased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateSubSetsInArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
List<Integer> al =new ArrayList<Integer>(Arrays.asList(1,2));
List<List<Integer>> res=generate(al);
System.out.println(res);
	}

	private static List<List<Integer>> generate(List<Integer> al)
	{
		// TODO Auto-generated method stub
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		int n=al.size();
		for(int i=0;i<n;i++){
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(al.get(i));
			res.add(l1);
			//System.out.println(res);
			for(int j=i+1;j<n;j++){
				List<Integer> l2=new ArrayList<Integer>();
				l2.add(al.get(i));
				l2.add(al.get(j));
				res.add(l2);
				while(j-i>=2&&j<n){
					List<Integer> l3=new ArrayList<Integer>();
					for(int k=i;k<=j;k++){
						l3.add(al.get(k));
					}
					res.add(l3);
					List<Integer> l4=new ArrayList<Integer>();
					for(int k=i;k<=j;k++){
						if(k==i+1){
							continue;
						}
						l4.add(al.get(k));	
					}
					res.add(l4);
					break;	
				}
			}
		}
		return res;
	}

}
