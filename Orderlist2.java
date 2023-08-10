import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class Productlist2 
{
private int productid1;
private int rate1;
private String quality1;

public Productlist2(int productid1,int rate1,String quality1)
{
	this.productid1=productid1;
	this.rate1=rate1;
	this.quality1=quality1;
}
public int get1()
{
return productid1;	
}
public int get2()
{
return rate1;	
}
public String get3()
{
return quality1;	
}
}
class Orderlist2
{
		private int orderid;
		private int orate;
		private String description;
		Orderlist2(int orderid,int orate,String description)
		{
			this.orderid=orderid;
			this.orate=orate;
			this.description=description;
		}
		public int get11()
		{
		return orderid;	
		}
		public int get22()
		{
		return orate;	
		}
		public String get33()
		{
		return description;	
		}
	public static void main(String args[])
	{	
	List<Productlist2> a=new ArrayList<Productlist2>();
	a.add(new Productlist2(1,10,"1st quality"));
	a.add(new Productlist2(2,20,"2nd quality"));
	a.add(new Productlist2(3,30,"3nd quality"));
	Scanner obj=new Scanner(System.in);
	List<Orderlist2> b=new ArrayList<Orderlist2>();
	for(int i=0;i<3;i++)
	{
		System.out.println("enter order ID");
		int orderid=obj.nextInt();
		System.out.println("enter order rate");
		int orate=obj.nextInt();
		System.out.println("enter description");
		String description=obj.next();	
		Orderlist2 obj2=new Orderlist2(orderid,orate,description);
		b.add(obj2);
	}
	for(Productlist2 c :a)
	{
		for(Orderlist2 d :b)
		{
			if(c.get1()==d.get11())
			{
				System.out.println("product ID: "+c.get1()+"  Order ID:"+d.get11()+"  Product rate:"+c.get2()+"  Product Quality:"+c.get3()
				+"  Order rate:"+d.get22()+"  Order description:"+d.get33());
			}
		}
	}
	}
}
