import java.util.*;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		System.out.println("Number of Attempt: ");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		
		int num = 1 + (int)(Math.random()*100); 
		int i;
		for(i=1;i<=k;i++) {
			System.out.println("Enter the number :");
			int guessNo = sc.nextInt();
			
			if(guessNo==num) {
				System.out.println("You won the game");
				break;
			}
			else if(guessNo>num) {
				System.out.println("The number is grater than the actual number");
			}
			else {
				System.out.println("The number is less than the actual number");
			}
		}
		if(i>k) {
			System.out.println("Total attempt is exhausted");
		}
		System.out.println("The actual number is : "+num);
		sc.close();
	}

}
