import java.util.Scanner;
class even{
public static void main(String args[]){
	System.out.println("Enter a number");
	Scanner even2=new Scanner(System.in);
	int a=even2.nextInt();
    switch(a%2){
		case 0:
		System.out.println("The entered number"+ a+"  is even number"+b);
		break;
		case 1:
		System.out.println("The entered number"+ a+"  is odd number");
		break;
		default:
		System.out.println("You're not entering a number,Please enter a number.");
	}
	
	
}
 	
}