class LibraryBook{
private String author;
private String title;
private String isbn;
private String callNumber;
private static int numOfBooks;

private int floorNumber;

public LibraryBook(String author, String title, String isbn) {

        this.author = author;
        this.title = title;
        this.isbn = isbn;

        floorNumber = (int) (Math.random() * 99 + 1);

        this.callNumber = generateCallNumber();
        numOfBooks++;
        }

public LibraryBook(String author, String title) {
        this(author, title, "notavailable");
        }

public LibraryBook() {

        this("notavailable", "notavailable", "notavailable");
        }

private String generateCallNumber() {

        if (floorNumber < 10) {
        return "0" + floorNumber + "." + author.substring(0, 3) + "." + isbn.charAt(isbn.length() - 1);
        } else {
        return floorNumber + "." + author.substring(0, 3) + "." + isbn.charAt(isbn.length() - 1);
        }
        }

// getters and setters

public String getAuthor() {
        return author;
        }

public void setAuthor(String author) {
        this.author = author;
        }

public String getTitle() {
        return title;
        }

public void setTitle(String title) {
        this.title = title;
        }

public String getIsbn() {
        return isbn;
        }

public void setIsbn(String isbn) {
        this.isbn = isbn;
        }

public String getCallNumber() {
        return callNumber;
        }

public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
        }

public static int getNumOfBooks() {
        return numOfBooks;
        }
public static void setNumOfBooks(int numOfBooks) {
        LibraryBook.numOfBooks = numOfBooks;
        }

public String toString(){
        return "[" + isbn + "-" + title + " by " + author + "-" + callNumber + "]";
        }
        }