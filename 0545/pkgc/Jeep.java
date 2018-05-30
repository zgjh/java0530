package pkgc;
import java.lang.*;
import pkga.Vehicle;
public class Jeep extends Vehicle
{
	@Override public void start()
	{
		System.out.println("吉普車發動中..");
	}
	@Override public void breaks()
	{
		System.out.println("吉普車煞車中..");
	}
}