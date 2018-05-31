package tw.com.test.CalArea;
import java.lang.*;
import tw.com.math.Area.正方形;
import tw.com.math.Area.長方形;
public class 多邊形測試_p
{
	public static void main(String args[])
	{
		正方形 shap1=new 正方形();
		長方形 shap2=new 長方形();
		shap1.面積();
		shap1.週長();
		shap2.面積();
		shap2.週長();
	}
}