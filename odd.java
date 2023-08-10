import java.util.Scanner;
public class odd{
	public static void main(String args[]){
	Scanner leta=new Scanner(System.in);
  	System.out.println("enter integer a");
	int a=leta.nextInt();
	Scanner letb=new Scanner(System.in);
  	System.out.println("enter integer b");
	int b=letb.nextInt();
	Scanner letc=new Scanner(System.in);
  	System.out.println("enter integer c");
	int c=letc.nextInt();
	Scanner letd=new Scanner(System.in);
  	System.out.println("enter integer d");
	int d=letd.nextInt();
	Scanner lete=new Scanner(System.in);
  	System.out.println("enter integer e");
	int e=lete.nextInt();
	int evensum=0;
	int oddsum=0;
	int evencount=0;
	int oddcount=0;
	if(a%2==0){
		evensum += a;
		evencount+=1;
	System.out.println("this number"+"  "+ a+" "+"is an even number");
	}
	else{
		oddsum += a;
		oddcount+=1;
	System.out.println("this number"+"  "+ a+" "+ "is an odd number");	
	}
	if(b%2==0){
		evensum += b;
		evencount+=1;
	System.out.println("this number"+"  "+ b+" "+ "is an even number");
	}
	else{
		oddsum += b;
		oddcount+=1;
	System.out.println("this number"+"  "+ b+" "+ "is an odd number");	
	}
	if(c%2==0){
		evensum += c;
		evencount+=1;
	System.out.println("this number"+"  "+ c+" "+ "is an even number");
	}
	else{
		oddsum += c;
		oddcount+=1;
	System.out.println("this number"+"  "+ c+" "+ "is an odd number");	
	}
	if(d%2==0){
		evensum += d;
		evencount+=1;
	System.out.println("this number"+"  "+ d+" "+ "is an even number");
	}
	else{
		oddsum += d;
		oddcount+=1;
	System.out.println("this number"+"  "+ d+" "+ "is an odd number");	
	}
	if(e%2==0){
		evensum += e;
		evencount+=1;
	System.out.println("this number"+"  "+ e+" "+ "is an even number");
	}
	else{
		oddsum += e;
		oddcount+=1;
	System.out.println("this number"+"  "+ e+" "+ "is an odd number");	
	}
	System.out.println("sum of the even numbers are"+" "+ evensum);
	System.out.println("sum of the odd numbers are"+" "+ oddsum);
	System.out.println("The count of the even numbers are "+ evencount);
	System.out.println("The count of the odd numbers are "+ oddcount);
	int ea=evensum/evencount;
	int oa=oddsum/oddcount;
	System.out.println("The average of the even numbers are "+ ea);
	System.out.println("The average of the odd numbers are "+ oa);
	
	
	
	}
}