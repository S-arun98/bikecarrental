class AA
 {
	 int a=43;
	 static int b=23;
	 
	void add()
	{
	int c=a+b;
	System.out.println(c);
	} 
	static int sub()
	{
    System.out.println(b);
	AA obj2=new AA();	
	int d=obj2.a-b;
	return d;
	
	} 
 }
class BB
 {
	 static int e=32;
	 static int multi()
	 {
		System.out.println(AA.b);
		AA obj3=new AA();	
	    int d2=obj3.a-AA.b;
	    return d2;
	    
	 }
	 int divi(int e)
	 {   
	    System.out.println(e);
		 return e;
		 
	 }
 }
class C 
 {
 public static void main(String args[])
  {
	  AA obj4=new AA();
	  obj4.add();
	  AA.sub();
	  BB obj5=new BB();
	  BB.multi();
	  obj5.divi(32);
	  
  }
 }