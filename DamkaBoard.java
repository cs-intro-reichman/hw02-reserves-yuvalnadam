/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);

		for (int col = 0; col < size ;col++ ) 
		{

			for (int row = 0; row < size; row++ ) {
				if (col % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}
			}

			System.out.println();
			
		}

	}
}
