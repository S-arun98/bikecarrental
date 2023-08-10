public class interview2{
	public static void main(String args[]){
		int round1=89;
		int round2=89;
		int round3=80;
		int round4=80;
		
		
		if(round1>=80){
			System.out.println("Congradulations, You have cleared Round 1");
		}
		else{
			System.out.println("sorry you have failed to clear Round 1");
			}
		if((round1>=80)&&(round2>=80)){
			System.out.println("Congradulations, You have cleared Round 2");	
		}
		else{
			System.out.println("sorry you have failed to clear Round 2");
			}
		if((round1>=80)&&(round2>=80)&&(round3>=80)){
			System.out.println("Congradulations, You have cleared Round 3");	
		}
		else{
			System.out.println("sorry you have failed to clear Round 3");
			}
        if((round1>=80)&&(round2>=80)&&(round3>=80)&&(round4>=80)){
			System.out.println("Congradulations, You have cleared Round 4");	
		}
		else{
			System.out.println("sorry you have failed to clear Round 4");
			}			
		
	}
}