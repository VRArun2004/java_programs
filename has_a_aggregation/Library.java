package has_a_aggregation;

public class Library {
	String LibName;
	String libLocation;
	public static void main(String[] args) {
		Books wings = Books.create_new_book(1422, "wings of fire");
		System.out.println(wings.BookId);
		System.out.println(wings.BookName);
	}
}
