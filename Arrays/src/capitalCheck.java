import java.util.ArrayList;

public class capitalCheck {

	ArrayList<String> general = new ArrayList<String>();
	
	public int count(ArrayList<String> another) 
	{
		int counter = 0;
		general = another;
		
		for(String a: general) 
		{
			if (Character.isUpperCase(a.charAt(0))) 
			{
				counter++;
			}
		}		
		return counter;
	}
	
	public ArrayList<String> convert(ArrayList<String> another)
	{
		// Write code for converting 'a' to 'b' and 'c' with 'x' here
			
			
		return general;
	}
}
