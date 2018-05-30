package pkgd;
import java.lang.*;
import pkga.Vehicle;
import pkgb.RV;
import pkgc.Jeep;
public class hw2
{
	public static void main(String args[])
	{
		RV car1=new RV();
		Jeep car2=new Jeep();
		car1.start();
		car1.breaks();
		car2.start();
		car2.breaks();
	}
}