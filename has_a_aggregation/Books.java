package has_a_aggregation;

public class Books {
	int BookId;
	String BookName;

	public static Books create_new_book(int BookId,String BookName) {
		Books book = new Books();
		book.BookId=BookId;
		book.BookName=BookName;
		return book;
	}

}
