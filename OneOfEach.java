
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		int sum = 0; 
		boolean girl = false;
		boolean boy = false;
		String result = ""; 


		while(!girl || !boy)
		 {
		 	 int rand = (int)(Math.random() * 2); 
		 	if (rand == 1)
		 	{
		 		result += "b "; 
		 		boy = true;

		 	}
		 	if ( rand == 0)
		 	{
		 		result += "g ";
		 		girl = true; 
		 		
		 	}
		 	sum ++; 

		}

		System.out.println(result);
		System.out.println("You made it... and you now have " + sum + " children.");

	}
}
