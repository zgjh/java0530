import java.lang.*;
public class ex11_04
{
	public static void main(String args[])
	{
		String str1 = new String("abcabcabcabcabcbbcbbc");
		int counter = 0,k = 0;
		while(k<str1.length())
		{
			if(str1.indexOf("bc",k) != -1)
			{
				k+=3;
				counter++;
			}
			else	//都沒找到
			{
				break;
			}
		}
		System.out.println("bc出現在" + str1 + "共" + counter +"次");
	}
}