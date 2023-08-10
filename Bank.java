class Bank
{
private int acno;
private int balance;

public void Setacno(int acno,int balance)
{
	this.acno=acno;
	this.balance=balance;
}

public int Getacno()
{
	return acno;
}

public int Getbalance()
{
	return balance;
}

public static void main(String args[])
{
	Bank obj=new Bank();
	obj.Setacno(58686,600000);
	System.out.println(obj.Getacno());
	System.out.println(obj.Getbalance());
	
}
}