import java.util.Scanner;

public class arrayManipulation {

	private static Scanner sc;

	public static void main(String[] args) {
		
		String str;
		sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		String[] stringArray = str.split(" ");
		
		for (String a : stringArray)
			System.out.println(a);
	}

}
