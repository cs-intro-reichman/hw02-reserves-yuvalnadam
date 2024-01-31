/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)
	{
		String str = args[0];
		int ln = str.length() - 1;
		char middle = str.charAt(str.length() / 2);

		for (int i = ln ; i >= 0 ; i--)
		 {

		 	System.out.print(str.charAt(ln)); 
			ln -= 1;	
		}
		
		System.out.println();
		System.out.println("The middle character is " + middle);		
	}
}

