/** Debugging compilations: WAp full of mixed errors- a combination of
 * logical erros, syntax errors(missing imports, Capilization) and semantic 
 * error and specify them with required comment line **/
package ch14;

public class Q13 {

	public static void main(String[] args) {
				//Loogical error
				int a = 5 ; int b = 10;
				int multiplication = a * b;
				System.out.println("Addition " +multiplication);
				
				//SyntAX ERROR
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a number ");
				int number =  scanner.nextInt();
				
				//Semantic error
				if(number % 2 == 1) {
					System.out.println("THe number is divisibl by 2");
				}
				
				float f = 10.5f;
				int i = (int)f;
				
				
				scanner.close();
	}

}
