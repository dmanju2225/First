package stringBased;

public class OccuranceOfLetterInWord
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
String str=new String("word");
int i=occuranceOfLetter(str);
System.out.println(i);
	}

	private static int occuranceOfLetter(String str)
	{
		// TODO Auto-generated method stub
		int n=str.length();
		for(int i=0;i<n;i++){
			if(str.charAt(i)=='r'){
				return i;
			}
		}
		return -1;
	}

}
