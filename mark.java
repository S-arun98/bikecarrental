import java.util.Scanner;
public class mark{
	public static void main(String args[]){
	Scanner ma1=new Scanner(System.in);
	System.out.println("Enter the tamil mark");
	int a=ma1.nextInt();
	Scanner ma2=new Scanner(System.in);
	System.out.println("Enter the english mark");
	int b=ma2.nextInt();
	Scanner ma3=new Scanner(System.in);
	System.out.println("Enter the maths mark");
	int c=ma3.nextInt();
    Scanner ma4=new Scanner(System.in);
	System.out.println("Enter the science mark");
	int d=ma4.nextInt();
    Scanner ma5=new Scanner(System.in);
	System.out.println("Enter the social science mark");
	int e=ma5.nextInt();
	
	int f=(a+b+c+d+e)/5;
	int g=a+b+c+d+e;
	if(a>=35){
    System.out.println("student passed in the subject tamil"+" "+"with the score of"+" "+a);			
	}
	else{
    System.out.println("student failed in the subject tamil"+" "+"with the score of"+" "+a);			
	}
	if(b>=35){
    System.out.println("student passed in the subject english"+" "+"with the score of"+" "+b);			
	}
	else{
    System.out.println("student failed in the subject english"+" "+"with the score of"+" "+b);			
	}
	if(c>=35){
    System.out.println("student passed in the subject maths"+" "+"with the score of"+" "+c);			
	}
	else{
    System.out.println("student failed in the subject maths"+" "+"with the score of"+" "+c);			
	}
	if(d>=35){
    System.out.println("student passed in the subject science"+" "+"with the score of"+" "+d);			
	}
	else{
    System.out.println("student failed in the subject science"+" "+"with the score of"+" "+d);			
	}
	if(e>=35){
    System.out.println("student passed in the subject social science"+" "+"with the score of"+" "+e);			
	}
	else{
    System.out.println("student failed in the subject social science"+" "+"with the score of"+" "+e);			
	}
	if(g>350){
		System.out.println("grade of the student A");
	}
	else if(g>250){
		System.out.println("grade of the student B");
	}
	else{
		System.out.println("grade of the student c");
	}
    System.out.println("Avearage score of the student is  "+" "+ f);	
	System.out.println("total score of the student is"+" "+ g+"/500" );
	
	
	}
	
}