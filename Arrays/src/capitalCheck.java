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
		general = another;
		String regex1 = "a",regex2 = "c",replacement1 = "b", replacement2 = "x";
		
		for(int i = 0; i < general.size(); i++) 
		{
			
			general.set(i, general.get(i).replaceAll(regex1, replacement1));
			general.set(i, general.get(i).replaceAll(regex2, replacement2));
			
		}	
		return general;
	}
}
