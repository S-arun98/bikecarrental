import java.util.Scanner;
public class week{
	public static void main(String args[]){
		Scanner count=new Scanner(System.in);
		System.out.println("Enter the weekday ");
		int day=count.nextInt();
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		int e=5;
		int f=6;
		int g=7;
		if(day==a){
		System.out.println("The entered weekday is monday");}
		else if(day==b){
		System.out.println("The entered weekday is tuesday");}
		else if(day==c){
		System.out.println("The entered weekday is wednesday");}
		else if(day==d){
		System.out.println("The entered weekday is thursday");}
		else if(day==e){
		System.out.println("The entered weekday is friday");}
		else if(day==f){
		System.out.println("The entered weekday is saturday");}
		else if(day==g){
		System.out.println("The entered weekday is sunday");}
		else{
			System.out.println("The number you entered is not between 1 to 7. please enter a number between 1 to 7 " );
			}
	}
}	