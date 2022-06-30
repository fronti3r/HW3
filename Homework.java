import java.util.Scanner;

public class Homework {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        BookstoreBook[] bookstoreBooks = new BookstoreBook[100];
        LibraryBook[] libraryBooks = new LibraryBook[200];

        int bookstoreBooksCount = 0;
        int libraryBooksCount = 0;

        System.out.println("Welcome to the Book program!");

        String questionOne = "yes";
        do{
            System.out.println("Would you like to create a book object? (yes/no):");
            questionOne = input.nextLine();
            if (!questionOne.equals("yes") && !questionOne.equals("no")){
                System.out.println("I'm sorry but " + questionOne + " is not a valid answer. Please enter either yes or no:");continue;
            }
            else if(questionOne.equals("no")){
                System.out.println("Sure!");
                System.out.println("Here are all your books...");
                break;
            }

            System.out.println("Please enter the author, title and the isbn of the book separated by / :");
            String bookInfo = input.nextLine();

            String[] bookInfoArray = bookInfo.split("/");

            String author = bookInfoArray[0];
            String title = bookInfoArray[1];
            String isbn = bookInfoArray[2];

            System.out.println("Got it!");

            System.out.println("Now, tell me if the book is a bookstore book or a library book (BB/LB) (enter BB for bookstore book and LB for library book)");
            String bookType = input.nextLine();

            while(!bookType.equals("BB") && !bookType.equals("LB")){
                System.out.println("Oops! That's not a valid entry. Please try again: ");
                bookType = input.nextLine();
            }

            System.out.println("Got it!");

            if(bookType.equals("BB")){
                System.out.println("Please enter the list price of " + title + " by " + author + ":") ;
                double listPrice = input.nextDouble();
                input.nextLine();

                System.out.println("Is it on sale? (y/n)");
                String sale = input.nextLine();

                boolean onSale = false;
                double discount = 0;
                if(sale.equals("y")){
                    System.out.println("Deduction percentage: ") ;
                    discount = input.nextDouble();
                    input.nextLine();
                    onSale = true;
                }

                System.out.println("Got it!");

                bookstoreBooks[bookstoreBooksCount] = new BookstoreBook(author, title, isbn, listPrice, onSale, discount);

                System.out.println("Here is your bookstore book information: ");
                System.out.println(bookstoreBooks[bookstoreBooksCount].toString());

                bookstoreBooksCount++;

            } else {

                libraryBooks[libraryBooksCount] = new LibraryBook(author, title, isbn);

                System.out.println("Here is your library book information: ");
                System.out.println(libraryBooks[libraryBooksCount].toString());

                libraryBooksCount++;
            }


        }while(questionOne.equals("yes") || !questionOne.equals("yes") || !questionOne.equals("no"));

        System.out.println("Library Books " + "(" + libraryBooksCount + ")");
        for(int i = 0; i<libraryBooksCount; i++) {
            System.out.println(libraryBooks[i].toString());
        }
        System.out.println("--------------------");
        System.out.println("Bookstore Books " + "(" + bookstoreBooksCount + ")");
        for(int i = 0; i < bookstoreBooksCount; i++){
            System.out.println(bookstoreBooks[i].toString());
        }
        System.out.println("-------------------");
        System.out.println("Take care now!");
        input.close();
    }





}