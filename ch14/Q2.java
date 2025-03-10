/**Even Odd checker error: WAP a program to check even or odd.Introduce an error by using 
if(num%2==1) instead of if(num%2==0)**/
package ch14;

public class Q2 {
	public static void main(String[] args) {
		int num=10;
		if(num%2==1) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+ " is Odd");
		}
	}

}
