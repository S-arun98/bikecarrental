
public class Multi extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
class B
{
public static void main(String args[])
{
	Multi t1=new Multi();
	Multi t2=new Multi();
	Multi t3=new Multi();
	Multi t4=new Multi();
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
