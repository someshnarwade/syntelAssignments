import java.util.ArrayList;
import java.util.Scanner;

public class arrayManipulation {

	private static Scanner sc;

	public static void main(String[] args) {
		
		String str;
		int count = 0;
		sc = new Scanner(System.in);
		ArrayList<String> arrList = new ArrayList<String>(); 
		str = sc.nextLine();
		
		String[] stringArray = str.split(" ");
		
		for (int i = 0; i < stringArray.length; i++)
			arrList.add(stringArray[i]);
		
		capitalCheck cc =  new capitalCheck();
		count = cc.count(arrList);
		
		System.out.println("The number of words starting with capital letter");
		System.out.print("in your sentence is ");
		System.out.println(count);
		
	}

}
