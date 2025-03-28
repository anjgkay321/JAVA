package ONE.Domain;

public class BookDTO {
	private int book_Code;
	private int Classification_id;
	private String book_author;
	private String book_name;
	private String publisher;
	private int isreservel;
	//생성자
	public BookDTO(int book_Code, int classification_id, String book_author, String book_name, String publisher,
			int isreservel) {
		super();
		this.book_Code = book_Code;
		Classification_id = classification_id;
		this.book_author = book_author;
		this.book_name = book_name;
		this.publisher = publisher;
		this.isreservel = isreservel;
	}
	//toString
	@Override
	public String toString() {
		return "BookDTO [book_Code=" + book_Code + ", Classification_id=" + Classification_id + ", book_author="
				+ book_author + ", book_name=" + book_name + ", publisher=" + publisher + ", isreservel=" + isreservel
				+ "]";
	}
	//getter setter
	public int getBook_Code() {
		return book_Code;
	}
	public void setBook_Code(int book_Code) {
		this.book_Code = book_Code;
	}
	public int getClassification_id() {
		return Classification_id;
	}
	public void setClassification_id(int classification_id) {
		Classification_id = classification_id;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getIsreservel() {
		return isreservel;
	}
	public void setIsreservel(int isreservel) {
		this.isreservel = isreservel;
	}
	
}
