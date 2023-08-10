import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        
        Scanner leap=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=leap.nextInt();
        boolean a = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);

        if (a == true)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
		//Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, 
		//but these centurial years are leap years if they are exactly divisible by 400. For example, the years 1700, 1800, and 1900 are not leap years
    }
}