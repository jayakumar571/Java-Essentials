package FlowControlPrograms;

import java.util.Scanner;;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 256;
		int b = sc.nextInt();
		System.out.println("Values of a = "+a+" and b = "+b+" before swapping");
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Values of a = "+a+" and b = "+b+" after swapping");
		sc.close();
	}

}
