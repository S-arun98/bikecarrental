public class Interviewf{
	public static void main(String args[]){
		int round1=89;
		int round2=8;
		int round3=80;
		boolean interview=(round3==true);
		if(interview==true){
			System.out.println("congraulations, you are selected");
			boolean round1=(round1>=80);
		if(round1==true){
			System.out.println("Congradulations, You have cleared Round 1");
		}
		else{
			System.out.println("sorry you have failed to clear Round 1");
			}	
			boolean round2=((round1>=80)&&(round2>=80));
		if(round2==true){
			System.out.println("Congradulations, You have cleared Round 2");	
		}
		else{
			System.out.println("sorry you have failed to clear Round 2");
			}
			boolean round3=((round1>=80)&&(round2>=80)&&(round3>=80));
		if(round3==true){
			System.out.println("Congradulations, You have cleared Round 3");	
		}
			
		else{
			System.out.println("sorry, you are not meet with our requirement,Better luck next time");
		}
		
	}
	}
}