import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner calculator = new Scanner (System.in);
		System.out.print ("Enter the first number");
		double A = calculator.nextDouble();
		System.out.print("Enter the second number");
		double B = calculator.nextDouble();
		char x = calculator.next().charAt(0);
		if(x=='+') {
			System.out.println(A+B);
		}else if(x=='-') {
			System.out.println(A-B);
		}else if(x=='*') {
			System.out.println(A*B);
		}else if(x=='/') {
			System.out.println(A/B);
		}else if(x=='%') {
			System.out.println(A%B);
		}else if(x!='+' || x!='-' || x!='*' || x!='/' || x!='%' ) {
			System.out.println("The operation is unacceptable");
		}
		
			
	}
		
			
		
	}

}
