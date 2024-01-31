/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int families = Integer.parseInt(args[0]);
		int sum = 0;
		int sum2child = 0;
		int sum3child = 0;
		int sum4child = 0;

		for (int i = 0; i < families; i++) {

		int sumforchild = 0; 

		boolean girl = false;
		boolean boy = false;

		while( !girl || !boy)
		 {
		 	 int rand = (int)(Math.random() * 2); 
		 	if (rand == 1)
		 	{
		 		boy = true;
		 	}
		 	if ( rand == 0)
		 	{
		 		girl = true; 		 		
		 	}
		 	sumforchild ++; 

		}

		if (sumforchild == 2)
		{
			sum2child += 1;
		}

		if(sumforchild == 3)
		{
			sum3child += 1;
		}
		if(sumforchild == 4 || sumforchild > 4)
		{
			sum4child += 1; 
		}

		sum += sumforchild;

		}

		double avg = (double)sum / families; 
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2child);
		System.out.println("Number of families with 3 children: " + sum3child);
		System.out.println("Number of families with 4 children: " + sum4child);

		int mostcommon = Math.max(Math.max(sum2child, sum3child), sum4child);
		
		System.out.println("The most common number of children is " + mostcommon + ".");


	}	
}
