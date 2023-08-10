import java.util.InputMismatchException;
import java.util.Scanner;

public class CarBikeRental2 extends Thread{
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        String mobileNumber;
        String email;
        String addressProof;
        int rentalDays;
        int choice;
        int log2=0;
		
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                     Welcome to Arun Car Bike rentals");
        System.out.println("---------------------------------------------------------------------------------");
        //Creating or login user name
        System.out.println("Please create an account.");
		System.out.println("NOTE:If you already have an account,Please login by pressing 1");
		System.out.println("Press any other number to create a new account");
		try
		{
		int log=scanner.nextInt();
		log2=log;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a valid number");
		}
		//username----------------------------------------------------------------------------------------------------------
		if(log2!=1)
		{
        System.out.println("create your username(upto 8 characters only): ");
        username = scanner.next();
        	if(username.length()>8)
        	{
        		while(username.length()>8)
        		{
        	    System.out.println("Sorry,you entered more than 8 digits,Try again");
        	    username = scanner.next();
        		}
        	}
        	else
        	{
        		System.out.println("Username Created Successfully");
        	}
        //password-------------------------------------------------------------------------------------------------------------
        System.out.println("create your password(4 digits only): ");
        password = scanner.next();
        boolean isValid = false;
        while (!isValid) 
        {
            if (password.matches("\\d{4}"))
            {
                isValid = true;
                System.out.println("Password created successfully");
            } 
            else 
            {
                System.out.println("Invalid password! Please enter a 4-digit number.");
                password = scanner.next();
            }
        }	
        //mobile number-----------------------------------------------------------------------------------------------------------
        System.out.println("Enter your 10 Digit mobile number: ");
        mobileNumber = scanner.next();
        boolean isValid2 = false;
        while (!isValid2) 
        {
            if (mobileNumber.matches("\\d{10}"))
            {
                isValid2 = true;
                System.out.println("Mobile number registered successfully");
            } 
            else 
            {
                System.out.println("Invalid Mobile number! Please enter a 10-digit number.");
                mobileNumber = scanner.next();
            }
        }
        //email--------------------------------------------------------------------------------------------------------------------
        System.out.println("Enter your email: ");
        email = scanner.next();
		
		}
        //login--------------------------------------------------------------------------------------------------------------------
		else
		{
			
		System.out.println("Enter your login ID:");
        String loginID = scanner.next();
        System.out.println("Enter your password:");
        String password2 = scanner.next();	
		}
		//otp---------------------------------------------------------------------------------------------------------------------
				int otp2 = (int) (Math.random() * 10000);
		        System.out.println("An OTP has been sent to your registered mobile number and email.");
		        System.out.println(otp2+" is received in registered mobile number");
				System.out.print("Enter OTP: ");
		        int userOtp2 = scanner.nextInt();
		        if (userOtp2 != otp2) 
		        {
		        	while(userOtp2 != otp2)
		        	{
		        		System.out.println("You entered wrong OTP");
		        		int otp3 = (int) (Math.random() * 10000);
		                System.out.println("Again An OTP has been sent to your registered mobile number and email.");
		                System.out.println(otp3+" is received in registered mobile number");
		        		System.out.print("Enter OTP: ");
		                int userOtp3 = scanner.nextInt();
		        	if(userOtp3 != otp3)
		        	{
		        		break;
		        	}
		        	else
		       		{
		       			System.out.println("OTP verified successfully!");
		       			break;
		       		}
		        	
		        	}
		        }
		        else
		        {
		        	System.out.println("OTP verified successfully!");
		        }
		//Drive selection------------------------------------------------------------------------------------------------------        
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("                          Awesome, You are one step away to pick your drive ");
		System.out.println("--------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        String[] cars = {"Suzuki Swift", "Toyota Innova", "Honda civic", "Tata Indica"};
        String[] bikes = {"Royal Enfield", "Yamaha R15", "Honda shine", "Tvs Apache"};
        int carPrice = 3350;
        int bikePrice = 400;
        //proof submission--------------------------------------------------------------------------------------------------------
        System.out.println("Enter your 12 Digit Aadhar Card number for Proof:");
        String proof = sc.next();
        boolean isValid3 = false;
        while (!isValid3) 
        {
            if (proof.matches("\\d{12}"))
            {
                isValid3 = true;
                System.out.println("Proof Submission Successful");
            } 
            else 
            {
                System.out.println("Sorry,you not entered 12 digit aadhar card number,Try again");
                proof = sc.next();
            }
        }
        System.out.println("Enter the number of days you want to rent:");
        int days = sc.nextInt();
        System.out.println("Enter the type of vehicle you want to rent (Car/Bike):");
        String vehicleType = sc.next();
        if (vehicleType.equalsIgnoreCase("car")) {
            System.out.println("Available cars:");
            for (int i = 0; i < cars.length; i++) {
                System.out.println((i + 1) + ". " + cars[i]);
            }
            System.out.println("Enter the car number you want to rent:");
            int carNumber = sc.nextInt();
            int totalAmount = carPrice * days;
            System.out.println("Your total amount is: Rs" + totalAmount);
            System.out.println("Late due notification will be sent after 3 days.");
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            System.out.println("Available bikes:");
            for (int i = 0; i < bikes.length; i++) {
                System.out.println((i + 1) + ". " + bikes[i]);
            }
            System.out.println("Enter the bike number you want to rent:");
            int bikeNumber = sc.nextInt();
            int totalAmount = bikePrice * days;
            System.out.println("Your total amount is: Rs" + totalAmount);
            System.out.println("Late due notification will be sent after 3 days.");
        } else {
            System.out.println("Invalid vehicle type!");
        }
    }
}
