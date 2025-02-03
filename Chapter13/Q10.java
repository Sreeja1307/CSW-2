package Chapter13;

public class Q10 {
	public int myVar;
	Q10(int myVar) {		this.myVar = myVar;		}
	public boolean equals(Object o) {
				if(o instanceof Q10) {
					Q10 hTest = (Q10) o;
					if (hTest.myVar == this.myVar) {		return true;	} 
					else {						return false;					}
				}
				else {					
					return false;				}
	}
	public int hashCode() {
		return (myVar + 23);
	}
	public static void main(String args[]) {
		Q10 ob=new Q10(15);
		Q10 ob1=new Q10(115);
		System.out.println("If 2 Objects r Equal: "+ob.equals(ob1));
		System.out.println(ob.hashCode());
	}
}