import java.util.Scanner;
class Resort
{	
public static void main(String args[])
{
	int total=0;
	int htotal=0;
	Scanner obj=new Scanner(System.in);
	while(true)
	{
		System.out.println(" ");
		System.out.println("Welcome to The Great View Beach Resorts");
		System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Select the type of Room for your stay");
		System.out.println("--------------------------------------------------------------------------------");
	    System.out.println("Choose 1 for our First class Presidential Suite,cost Per day: Rs.12000/-");
	    System.out.println("Choose 2 for our standard AC suite,cost Per day: Rs.8000/-");
	    System.out.println("Choose 3 for our Standard room with Air conditioning,cost per day: Rs.3000/- ");
		System.out.println("Choose 4 for our Standard room without Air conditioning,cost per day: Rs.2000/-");
		System.out.println("Choose 5 for our beach view rooms with Air conditioning,cost per day: Rs.5000/-");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("choose any other number if you're only here for Dinning");
		
	int room=obj.nextInt();
	switch(room)
	{
	case 1:
	System.out.println("You have selected our premium First class Presidential Suite");
	System.out.println("Please select the number of days you wank to stay, cost Per day: Rs.12000/-");
	int days=obj.nextInt();
	int troom=12000*days;
	System.out.println("Please select how many number of rooms you required");
	int nroom=obj.nextInt();
		if(nroom<10)
		{
		System.out.println("You requested for" + nroom + "number of rooms");
		}
		else
		{
		System.out.println("Sorry, We only have 10 number of rooms,Please select below 10 rooms");	
		}
	htotal+=nroom*troom;
System.out.println("-------------------------------------------------------------------------------------");	
	System.out.println("THE BILL TO BE PAID FOR ROOM");
	System.out.println("No of days to stay : "+ days+" with payable amount Rs."+troom);
	System.out.println("No of rooms booked : "+nroom);
	System.out.println("Total amount to be paid for room is Rs: "+htotal);
	break;
	case 2:
	System.out.println("You have selected our standard AC suite");
	System.out.println("Please select the number of days you wank to stay,cost Per day: Rs.8000/-");
	int days1=obj.nextInt();
	int troom1=8000*days1;
	System.out.println("Please select how many number of rooms you required");
	int nroom1=obj.nextInt();
		if(nroom1<10)
		{
		System.out.println("You requested for " + nroom1 + " number of rooms");
		}
		else
		{
		System.out.println("Sorry, We only have 10 number of rooms,Please select below 10 rooms");	
		}
	htotal+=nroom1*troom1;	
	System.out.println("THE BILL TO BE PAID FOR ROOM");
	System.out.println("No of days to stay : "+ days1+" with payable amount Rs."+troom1);
	System.out.println("No of rooms booked : "+nroom1);
	System.out.println("Total amount to be paid for room is Rs: "+htotal);
	break;
	case 3:
	System.out.println("You have selected our Standard room with Air conditioning");
	System.out.println("Please select the number of days you wank to stay,cost per day: Rs.3000/-");
	int days2=obj.nextInt();
	int troom2=3000*days2;
	System.out.println("Please select how many number of rooms you required");
	int nroom2=obj.nextInt();
		if(nroom2<10)
		{
		System.out.println("You requested for " + nroom2 + " number of rooms");
		}
		else
		{
		System.out.println("Sorry, We only have 10 number of rooms,Please select below 10 rooms");	
		}
	htotal+=nroom2*troom2;
	System.out.println("THE BILL TO BE PAID FOR ROOM");
	System.out.println("No of days to stay : "+ days2+" with payable amount Rs."+troom2);
	System.out.println("No of rooms booked : "+nroom2);
	System.out.println("Total amount to be paid for room is Rs: "+htotal);	
	break;
	case 4:
	System.out.println("You have selected our Standard room without Air conditioning");
	System.out.println("Please select the number of days you wank to stay,cost per day: Rs.2000/- ");
	int days3=obj.nextInt();
	int troom3=2000*days3;
	System.out.println("Please select how many number of rooms you required");
	int nroom3=obj.nextInt();
		if(nroom3<10)
		{
		System.out.println("You requested for " + nroom3 + " number of rooms");
		}
		else
		{
		System.out.println("Sorry, We only have 10 number of rooms,Please select below 10 rooms");	
		}
	htotal+=nroom3*troom3;	
	System.out.println("THE BILL TO BE PAID FOR ROOM");
	System.out.println("No of days to stay : "+ days3+" with payable amount Rs."+troom3);
	System.out.println("No of rooms booked : "+nroom3);
	System.out.println("Total amount to be paid for room is Rs: "+htotal);
	break;
	case 5:
	System.out.println("You have selected our Best beach view rooms with Air conditioning");
	System.out.println("Please select the number of days you wank to stay,cost per day: Rs.5000/- ");
	int days4=obj.nextInt();
	int troom4=5000*days4;
	System.out.println("Please select how many number of rooms you required");
	int nroom4=obj.nextInt();
		if(nroom4<10)
		{
		System.out.println("You requested for " + nroom4 + " number of rooms");
		}
		else
		{
		System.out.println("Sorry, We only have 10 number of rooms,Please select below 10 rooms");	
		}
	htotal+=nroom4*troom4;	
	System.out.println("THE BILL TO BE PAID FOR ROOM");
	System.out.println("No of days to stay : "+ days4+" with payable amount Rs."+troom4);
	System.out.println("No of rooms booked : "+nroom4);
	System.out.println("Total amount to be paid for room is Rs: "+htotal);
	break;
	default:
	System.out.println("You selected only Dining");
	}
	
	//room ends here
	
	// Food starts here
	
	System.out.println("---------------------------------------------------------------------------");
	System.out.println("Please choose whether you need food from our resort or not");
	System.out.println("Select 'y' for Yes & 'n' for No");
	char food=obj.next().charAt(0);
	if(food=='y')
	{
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
		}
		else
		{
			System.out.println("You choose not to have any food from our resort");
			System.out.println("--------------------------------------------------------------------");
		}
		System.out.println(" ");
		int ftotal=total+htotal;
		System.out.println("BILL");
		System.out.println("The amount to be payable is Rs: "+ftotal );
		double gtotal=0.18*ftotal;
		System.out.println("--------------------------------------------------------------------");
		System.out.println("The total amount to be payable with GST 18% is Rs: "+(ftotal+gtotal) );
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("Thank you!! visit again");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	
	
}
}
	
	