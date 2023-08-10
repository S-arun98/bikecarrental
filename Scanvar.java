import java.util.Scanner;
public class Scanvar{
	public static void main(String args[]){
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the tamil mark");
	int tamil=obj.nextInt();
	System.out.println("enter the english mark");
	int english=obj.nextInt();
	System.out.println("enter the maths mark");
	int maths=obj.nextInt();
	System.out.println("enter the science mark");
	int science=obj.nextInt();
	System.out.println("enter the socialscience mark");
	int socialscience=obj.nextInt();
		int total=tamil+english+maths+science+socialscience;
		int average=total/5;
		System.out.println("total score of the student is " + total);
		System.out.println("average of the student is " + average);
	}
}