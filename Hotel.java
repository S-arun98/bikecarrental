	import java.util.Scanner;
class Hotel
{
public static void main(String args[])
 {
	int starter;
	int maincourse;
	int desserts;
	int total=0;
	Scanner obj=new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Welcome to ARUN's Restraunt");
	    System.out.println("Choose a course from our menu");
	    System.out.println("Click 2 for our excellent starters");
	    System.out.println("Click 3 for our delicious main course");
	    System.out.println("Click 4 for our awesome desserts");
		
		int course=obj.nextInt();
		switch(course)
		{
		case 2:
		System.out.println("Some of our tongue twisting starters are in the menu. Please select your choice");
		System.out.println("choose a for veg Soup");
		System.out.println("choose b for chicken soup");
		System.out.println("choose c for plain soup");
		
		char soup=obj.next().charAt(0);
		   switch(soup)
		   { 
			case 'a':
			System.out.println("you selected veg soup");
			System.out.println("Please select how many cups of soup you needed");
			int qty=obj.nextInt();
			int vegsoup=30;
			int cashveg=qty*vegsoup;
			System.out.println("Veg soup price Rs:"+ cashveg+ "for qty:"+qty );
			total=total+cashveg;
			break;
			case 'b':
			System.out.println("you selected chicken soup");
			System.out.println("Please select how many cups of soup you needed");
			int qty2=obj.nextInt();
			int chicksoup=60;
			int cashchick=qty2*chicksoup;
			System.out.println("chicken soup price Rs:"+ cashchick+ "for qty:"+qty2 );
			total=total+cashchick;
			break;
			case 'c':
			System.out.println("you selected plain soup");
			System.out.println("Please select how many cups of soup you needed");
			int qty3=obj.nextInt();
			int plsoup=20;
			int cashpl=qty3*plsoup;
			System.out.println("plain soup price Rs:"+ cashpl+ "for qty:"+qty3 );
			total=total+cashpl;
			break;
			default:
			System.out.println("Sorry, Please select one from the menu");
		  }
		  break;
		case 3:
		System.out.println("Some of our delicious main course are in the menu. Please select your choice");
		System.out.println("choose d for veg briyani");
		System.out.println("choose e for chicken briyani");
		System.out.println("choose f for meals");
		
		char briyani=obj.next().charAt(0);
		   switch(briyani)
		   { 
			case 'd':
			System.out.println("you selected veg briyani");
			System.out.println("Please select how many plate of briyani you needed");
			int qty4=obj.nextInt();
			int vegbri=60;
			int cashvegbri=qty4*vegbri;
			System.out.println("veg briyani price Rs:"+ cashvegbri+ " for qty:"+qty4 );
			total=total+cashvegbri;
			break;
			case 'e':
			System.out.println("you selected chicken briyani");
			System.out.println("Please select how many plate of briyani you needed");
			int qty5=obj.nextInt();
			int chickbri=100;
			int cashchickbri=qty5*chickbri;
			System.out.println("chicken briyani price Rs:"+ cashchickbri+ " for qty:"+qty5 );
			total=total+cashchickbri;
			break;
			case 'f':
			System.out.println("you selected meals");
			System.out.println("Please select how many plate of meals you needed");
			int qty6=obj.nextInt();
			int meals=60;
			int cashmeals=qty6*meals;
			System.out.println("meals price Rs:"+ cashmeals+ " for qty:"+qty6 );
			total=total+cashmeals;
			break;
			default:
			System.out.println("Sorry, Please select one from the menu");
		  }
		  break;
		  case 4:
		    System.out.println("Some of our desserts are in the menu. Please select your choice");
		    System.out.println("choose g for icecream");
		    System.out.println("choose h for falooda");
		    System.out.println("choose i for jaamun");
		
		    char desserts2=obj.next().charAt(0);
		   switch(desserts2)
		   { 
			case 'g':
			System.out.println("you selected ice cream");
			System.out.println("Please select how many scoops of icecream you needed");
			int qty7=obj.nextInt();
			int ice=60;
			int cashice=qty7*ice;
			System.out.println("Ice cream price Rs:"+ cashice+ " for qty:"+qty7 );
			total=total+cashice;
			break;
			case 'h':
			System.out.println("you selected falooda");
			System.out.println("Please select how many Glass of falooda you needed");
			int qty8=obj.nextInt();
			int fal=80;
			int cashfal=qty8*fal;
			System.out.println("Falooda price Rs:"+ cashfal+ " for qty:"+qty8 );
			total=total+cashfal;
			break;
			case 'i':
			System.out.println("you selected jaamun");
			System.out.println("Please select how many bowl of jaamun you needed");
			int qty9=obj.nextInt();
			int jam=30;
			int cashjam=qty9*jam;
			System.out.println("Jaamun price Rs:"+ cashjam+ " for qty:"+qty9 );
			total=total+cashjam;
			break;
			default:
			System.out.println("Sorry, Please select one from the menu");
		  }
		  break;
		  default:
			System.out.println("Sorry, Please select one from the menu");
		
		}
		
		System.out.println("The total bill amount is Rs:"+ total);
		System.out.println("Thanks for visiting our hotel. please visit again");
		System.out.println(" ");
		
	}
	
 }	
}