package assignment;
import java.util.*;
public class HashSet_1 {
	public static void main(String[] args) {
		HashSet<Integer> SId=new HashSet<Integer>();
		int ch=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\nEnter Your Choice");
			System.out.println("1.Register Student\n2.Check Registration\n3.Display All Registration\n4.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the Student ID: ");
				int id=sc.nextInt();
				if (SId.contains(id)) {
					System.out.println("!!! Duplicate Registration !!!");
				}
				else {
					SId.add(id);
					System.out.println("The Student ID "+id+" has been Registered");

				}
				break;
			case 2:
				System.out.println("Enter the Student Id to Check Registration :");
				id=sc.nextInt();
				if (SId.contains(id)) {
					System.out.println("!!! Student is Already Present in the Registration List !!!");
				}
				break;
			case 3:
				System.out.println("All Students Name: "+SId);
				break;
			default:
				System.out.println("Here Enter 4 to Click Out of the Loop");
				ch=sc.nextInt();
			}
		}while(ch!=4);
		sc.close();
	}
}