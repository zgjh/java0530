import java.lang.*;
import pkg1.多邊形;

public class 多邊形測試
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
class 正方形 implements 多邊形
{
	@Override public void 面積()
	{
		System.out.println("邊長為5的正方形面積：25.0");
	}
	@Override public void 週長()
	{
		System.out.println("邊長為5的正方形週長：20.0");
	}
}

class 長方形 implements 多邊形
{
	@Override public void 面積()
	{
		System.out.println("長為3寬為6的長方形面積：18.0");
	}
	@Override public void 週長()
	{
		System.out.println("長為3寬為6的長方形週長：18.0");
	}
}