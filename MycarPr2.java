import java.util.Scanner;

class Car
{
	double price;	
	
	public void values(double price)
	{	
		this.price=price;
	}
	
	public double GetSalePrice()
	{
		return price;
	}
}

class Sedan extends Car
{
	int length;
	
	public void values(double price,int length)
	{
		super.price=price;
		
		this.length=length;
	}
	
	public double getSalePrice()
	{
		if (length > 20)
		{
			super.GetSalePrice();
			System.out.println("your car lenght is more then 20 so you got 5% discount");
			return  0.05 * super.GetSalePrice();
		}
		else
		{
			super.GetSalePrice();
			System.out.println("your car lenght is less then 20 you got 10% discount");
			return  0.1 * super.GetSalePrice();
		}
	}
}
public class MycarPr2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Sedan s=new Sedan();
		
		System.out.println("enter the car price");
		double m=sc.nextDouble();
		
		System.out.println("enter the car length");
		int n=sc.nextInt();
		s.values(m, n);	
	     System.out.println("discount values:"+s.getSalePrice());
	}
}
