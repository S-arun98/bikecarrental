import java.util.Scanner;
class Switch{
	public static void main(String args[])
	{   System.out.println("Enter the user name");
	    Scanner a=new Scanner(System.in);
		String name=a.next();
		System.out.println("Enter your password");
		Scanner b=new Scanner(System.in);
		int password=b.nextInt();
		
	    
		
		switch(name){
			case "mani":
			System.out.println("user name is correct");
			 switch(password){
				case 2345:
				System.out.println("the password is correct");
				break;
				case 2545:
				System.out.println("the password is correct");
				break;
				case 2565:
				System.out.println("the password is correct");
			    break;
				}
			break;
			case "Arun":
			System.out.println("user name is correct");
			 switch(password){
				case 2345:
				System.out.println("the password is correct");
				break;
				case 2545:
				System.out.println("the password is correct");
				break;
				case 2565:
				System.out.println("the password is correct");
			    break;
				}
			break;
			case "Gowtham":
			System.out.println("user name is correct");
			 switch(password){
				case 2345:
				System.out.println("the password is correct");
				break;
				case 2545:
				System.out.println("the password is correct");
				break;
				case 2565:
				System.out.println("the password is correct");
			    break;
				}
			break;
            }
	        }
            }