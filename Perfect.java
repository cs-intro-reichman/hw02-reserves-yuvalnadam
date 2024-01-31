/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String div = "1";

			for (int d=2; d < num; d++)
		 	{
		 		if (num % d == 0)
		 		{
		 		sum += d;
		 		div += " + " + d;


		 		}
			}

		if(sum == num)
		{
			System.out.print(num + " is a perfect number since " + num + " = " + div);
		}
		else
		 {
			System.out.print(num + " is not a perfect number");
		}

	}

}
