import java.util.ArrayList;

class book {
    int bookId;
    String bookName;
    String authorName;

    book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<book> bookslist = new ArrayList<>();
        bookslist.add(new book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookslist.add(new book(2, "To Kill a Mockingbird", "Harper Lee"));
        bookslist.add(new book(3, "1984", "George Orwell"));
        System.out.println("All Books Details:");
       
        for (book book : bookslist) {
            System.out.println("Book ID: " + book.bookId);
            System.out.println("Book Name: " + book.bookName);
            System.out.println("Author Name: " + book.authorName);
            System.out.println();
        }
    }
}