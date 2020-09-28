/*53.	Input data exactly in the following format, and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.
 *    (Hint use String class split method and Integer class parseInt method) .*/


package p3;

public class Q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "67, 89, 23, 67, 12, 55, 66";
		String ar[] = input.split(", ");
		int sum = 0;
		for(String a : ar) {
			System.out.println(a);
			int v = Integer.parseInt(a);
			sum += v;
			
		}
		System.out.println("Sum of all Integer : "+sum);
	}

}
