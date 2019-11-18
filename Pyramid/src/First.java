
public class First {

	public void first() {
		
		String givenString = "ATOS-SYNTEL";
		int LENGTH = givenString.length() + 1;
		int n = 1, m = 0,x = 0;
		
		while(n <= LENGTH) {
			
			if(n <= LENGTH) {
						
				if(n == LENGTH) {
					
				}
				else {
					
					while(x < (LENGTH - n)) {
						System.out.print(" ");
						x++;
						
					}
					
					while(m < (LENGTH - x)) {
						System.out.print(givenString.charAt(m));
						System.out.print(" ");
						m++;
					}

				}
				m=0;	
				
			}
			System.out.println();
			
			x=0;
			n++;
		}
	}
}
