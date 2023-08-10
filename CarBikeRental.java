import java.util.Scanner;

public class CarBikeRental {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        String mobileNumber;
        String email;
        String addressProof;
        int rentalDays;
        int choice;
        int otp = (int) (Math.random() * 10000);
		

        System.out.println("Welcome to Car Bike Rental Company!");
        System.out.println("Please create an account.");
		System.out.println("If you already have an account,Please login by pressing 1");
		int log=scanner.next();
		if(log!=1)
		{
        System.out.print("create your username: ");
        username = scanner.nextLine();

        System.out.print("create your password: ");
        password = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        mobileNumber = scanner.nextLine();

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
		}
		else
		{
			
		System.out.println("Enter your login ID:");
        String loginID = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();	
		}

        System.out.println("An OTP has been sent to your registered mobile number and email.");
        System.out.println(otp+"is received in registered mobile number");
		System.out.print("Enter OTP: ");
        int userOtp = scanner.nextInt();

        if (userOtp == otp) {
            System.out.println("OTP verified successfully!");
            System.out.println("Please choose between a car or bike:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
        Scanner sc = new Scanner(System.in);
        String[] cars = {"Honda Civic", "Toyota Corolla", "Nissan Altima", "Ford Mustang"};
        String[] bikes = {"Harley Davidson", "Yamaha R1", "Suzuki Hayabusa", "Kawasaki Ninja"};
        int carPrice = 50;
        int bikePrice = 25;
        System.out.println("Welcome to Car Bike Rental Company!");
        System.out.println("Enter the number of days you want to rent:");
        int days = sc.nextInt();
        System.out.println("Enter your proof (Driving License/Aadhar Card):");
        String proof = sc.next();
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
            System.out.println("Your total amount is: $" + totalAmount);
            System.out.println("Late due notification will be sent after 3 days.");
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            System.out.println("Available bikes:");
            for (int i = 0; i < bikes.length; i++) {
                System.out.println((i + 1) + ". " + bikes[i]);
            }
            System.out.println("Enter the bike number you want to rent:");
            int bikeNumber = sc.nextInt();
            int totalAmount = bikePrice * days;
            System.out.println("Your total amount is: $" + totalAmount);
            System.out.println("Late due notification will be sent after 3 days.");
        } else {
            System.out.println("Invalid vehicle type!");
        }
    }
}