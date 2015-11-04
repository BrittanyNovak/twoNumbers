import java.util.Scanner;
import java.util.Random;

class TwoNumbers{

	public static void main(String [] args){
	
	int a = 0;
	int b = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter two numbers");
	a = in.nextInt();
	b = in.nextInt();
	
		
		Random r = new Random();
		int randomInteger = r.nextInt(a);
		int ranNum = r.nextInt(b);
		System.out.println("Random Number chosen " + (randomInteger + ranNum));
		
	}
}