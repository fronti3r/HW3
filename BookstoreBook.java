class BookstoreBook{
private String author;
private String title;
private String isbn;
private double price;
private boolean onSale;
private double discount;

private static int numOfBooks = 0;

public BookstoreBook(String author, String title, String isbn, double price, boolean onSale, double discount) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.onSale = onSale;
        this.discount = discount;

        }

public BookstoreBook(String author, String title, String isbn, double price) {
        this(author, title, isbn, price, false, 0);
        }

public BookstoreBook(String author, String title, String isbn) {
        this(author, title, isbn, 0);
        }

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

public double getPrice() {
        return price;
        }

public void setPrice(double price) {
        this.price = price;
        }

public boolean isOnSale() {
        return onSale;
        }

public void setOnSale(boolean onSale) {
        this.onSale = onSale;
        }

public double getDiscount() {
        return discount;
        }

public void setDiscount(double discount) {
        this.discount = discount;
        }

public double getPriceAfterDiscount() {
        return price - (price * discount / 100);
        }

public String toString(){
        return "[" + isbn + "-" + title + " by " + author + ", $" + price + " listed for $" + getPriceAfterDiscount() + "]";
        }

        }