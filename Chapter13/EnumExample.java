package EnumNdCollection;

enum Day{
	SUNDAY(0), MONDAY(1), TUESDAY(3), WEDNESDAY(5), THURSDAY(6), FRIDAY(7), SATURDAY(8);
	private final int index;
	Day(int index){ this.index=index;}
	public int getIndex() { return index; }
}
public class EnumExample {

	public static void main(String[] args) {
		Day today = Day.WEDNESDAY;
		int dayIndex = today.getIndex();
		System.out.println("Today is "+ today + "(Index: " + dayIndex +")" );
		switch (today) {
		case MONDAY: System.out.println("It's Monday."); break;
		case WEDNESDAY: System.out.println("It's Wednesday."); break;
		case FRIDAY: System.out.println("It's Friday."); break;
		default: System.out.println("It's neither Monday nor Friday."); break;
		}

	}
}
