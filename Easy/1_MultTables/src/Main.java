
/* Multiplication Tables - Easy
 * 
 * Print out the grade school multiplication table up to 12*12
 * 
 * Output:
 * Print out the table in a matrix like fashion, each number formatted to a width of 4.
 * The numbers are right-aligned and strip out the leading/trailing space on each line
 */
public class Main {

	public static void main(String[] args) {
		int n;
		
		for(int i=1; i <= 12; i++) {
			System.out.print(i);
			for(int j=2; j <= 12; j++) {
				n = i*j;
				System.out.format("%1$4d", n);
			}
			System.out.println();
		}
	}
}