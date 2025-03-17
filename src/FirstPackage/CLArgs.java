package FirstPackage;

/*
 * Program to process command line arguments
 */

public class CLArgs{
	public static void main (String [] args) {
		/* Printing Num of Arguments on line
		 * 
		
		 */
		System.out.println("num of args " + args.length);
		/*
		 * args is the array containing strings supplied
		 * on the command line
		 */
		for (int i=0; i <  args.length; i++ ) {
			/*
			 * print each argument at position i
			 */
			System.out.println(args [i]);
		}
	}
}