import java.util.Scanner;
public class month{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the month you need to find the days");
		String month=a.next();
		
		switch(month){
			case "january":
			System.out.println("there is 31 day is january");
			break;
			case "febraury":
			System.out.println("there is 28 day is febraury");
			break;
			case "march":
			System.out.println("there is 31 day is march");
			break;
			case "april":
			System.out.println("there is 30 day is april");
			break;
			case "may":
			System.out.println("there is 31 day is may");
			break;
			case "june":
			System.out.println("there is 30 day is june");
			break;
			case "july":
			System.out.println("there is 31 day is july");
			break;
			case "august":
			System.out.println("there is 31 day is august");
			break;
			case "september":
			System.out.println("there is 30 day is september");
			break;
			case "october":
			System.out.println("there is 31 day is october");
			break;
			case "november":
			System.out.println("there is 30 day is november");
			break;
			case "december":
			System.out.println("there is 31 day is december");
			break;
		}
	}
}
		