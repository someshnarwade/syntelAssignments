import java.util.Scanner;

public class myCalculator {

	private static Scanner sc;

	public static void main(String[] args) {
		
		double a = 5;
		double b = 10;
		int terminate = 0;
		String operator = "+";
		
		sc = new Scanner(System.in);

		Calculator c = new Calculator();
		
		while(terminate != 1) {
			
			System.out.println("Input first Number");
			a = Double.parseDouble(sc.nextLine());
			System.out.println("Input Operator");
			operator = sc.nextLine();
			System.out.println("Input Second Number");
			b = Double.parseDouble(sc.nextLine());

			switch(operator) {
			
				case "+":
					System.out.print(a);
					System.out.print(" + ");
					System.out.print(b);
					System.out.print(" = ");
					System.out.println(c.add(a, b));
					break;
	
				case "-":
					System.out.print(a);
					System.out.print(" - ");
					System.out.print(b);
					System.out.print(" = ");
					System.out.println(c.substract(a, b));
					break;
				
				case "*":
					System.out.print(a);
					System.out.print(" * ");
					System.out.print(b);
					System.out.print(" = ");
					System.out.println(c.multiply(a, b));
					break;
	
				case "/":
					System.out.print(a);
					System.out.print(" / ");
					System.out.print(b);
					System.out.print(" = ");
					System.out.println(c.divide(a, b));
					break;
					
				case "%":
					System.out.print(a);
					System.out.print(" % ");
					System.out.print(b);
					System.out.print(" = ");
					System.out.println(c.remainder(a, b));
					break;	
				
				default:
					System.out.println("Exiting...");
					terminate = 1;
					break;
			}
		}		
	}
}
