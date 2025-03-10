/** Precision loss: WAP where double is converted to int, causing a loss of precision **/
package ch14;

public class Q10 {

	public static void main(String[] args) {
		double d=(int) 10.5;
		System.out.println(d);
		
	}

}
