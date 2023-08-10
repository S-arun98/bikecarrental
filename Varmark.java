public class Varmark{
	int tamil=68;
	int maths=86;
	int science=95;
	int socialscience=98;
	 static int e=98;
	public static void main(String args[]){
		Varmark obj=new Varmark();
		int t=obj.tamil;
		int m=obj.maths;
		int s=obj.science;
		int ss=obj.socialscience;
		int total=t+e+m+s+ss;
		int average=total/5;
		System.out.println("tamil mark is " +t);
		System.out.println("english mark is " +e);
		System.out.println("maths mark is " +m);
		System.out.println("Science mark is " +s);
		System.out.println("social mark is " +ss);
		System.out.println("total score of the student is " + total);
		System.out.println("average of the student is " + average);
		
	}
}