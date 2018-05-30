package pack1;
import java.lang.*;
import pack2.CmyException;
public class hw1
{
	public static void main(String args[])
	{
		int[] x = new int[]{2,2,0,2};
		int[] y = new int[]{5,0,0,-2};
		for(int i=0;i<4;i++)
		{
			int result = powerXY(x[i],y[i]);
			System.out.println(x[i]+"��"+y[i]+"����="+result);
		}
	}
	
	public static int powerXY(int x,int y)
	{
		int result=1;
		try{
			if(x==0 && y==0)
				throw new CmyException();
			if(y<0)
				throw new NumberFormatException();
		}
		catch(CmyException e)
		{
			System.out.print("0��0����L�w�q,�^�ǭȱN���~\t");
			result = -1;
		}
		catch(NumberFormatException e)
		{
			System.out.print("���謰�t��,���G�������,�^�ǭȱN���~\t");
			result = -1;
		}
		for(int i=1;i<=y;i++)
			result *= x;
		return result;
	}
}