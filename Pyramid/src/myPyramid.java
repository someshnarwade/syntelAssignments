
public class myPyramid {

	public static void main(String[] args) {
		String givenString = "ATOS-SYNTEL";
		System.out.println(givenString);
		int n = 0, m =0;
		
		while(n <= givenString.length()) {
			if(n <= givenString.length()) {
				
				while(m < n) {
					System.out.print(" ");
					System.out.print(givenString.charAt(m));
					System.out.print(" ");
					m++;
				}
						
			}
			System.out.println();
			m=0;
			n++;
		}
		System.out.println("Out of while loop");
	}

}
