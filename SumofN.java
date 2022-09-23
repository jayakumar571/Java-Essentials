//WAP to add sum of all natural numbers from 1 to 50

public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 50, sum=0;
		for(int i=1;i<=range;i++) {
			sum += i;
		}
		System.out.println("Sum of all natural numbers from 1 to 50 is "+sum);
	}
}
