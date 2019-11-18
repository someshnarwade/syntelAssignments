
public class Second {

	public void second() {
		
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
						//System.out.print(m);
						
						if(n < LENGTH - 1) {
							if(m == 0 || m == (LENGTH - x - 1)	) 
							{
								System.out.print(givenString.charAt(m));
								System.out.print(" ");
							}
							else 
							{
								System.out.print(" ");
								System.out.print(" ");
							}
						}																	
						m++;
					}
					

				}
				m=0;	
				
			}
			if(n == LENGTH || n == LENGTH - 1) {
				
			}else {
				System.out.println();
			}
			
			x=0;
			n++;
		}
		n = 1;
		while(n < LENGTH) 
		{
			System.out.print(givenString.charAt(n - 1));
			System.out.print(" ");
			n++;
		}
	}
}
