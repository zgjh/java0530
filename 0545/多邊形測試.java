import java.lang.*;
import pkg1.�h���;

public class �h��δ���
{
	public static void main(String args[])
	{
		����� shap1=new �����();
		����� shap2=new �����();
		shap1.���n();
		shap1.�g��();
		shap2.���n();
		shap2.�g��();
	}
}
class ����� implements �h���
{
	@Override public void ���n()
	{
		System.out.println("�����5������έ��n�G25.0");
	}
	@Override public void �g��()
	{
		System.out.println("�����5������ζg���G20.0");
	}
}

class ����� implements �h���
{
	@Override public void ���n()
	{
		System.out.println("����3�e��6������έ��n�G18.0");
	}
	@Override public void �g��()
	{
		System.out.println("����3�e��6������ζg���G18.0");
	}
}