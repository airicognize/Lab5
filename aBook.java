/**
 * a class encapsulating the concept of a book. The attributes of a book are title,author,ISBN andyear of publishing.
 * The class has a static attribute publisher initialized as “Vanier”, and an amountOfBooks, which is initially zero. 
 * Include a constructor, accessors and mutators, and the methods toString and equals. 
 * Every time a new object is instantiated, the class variable amountOfBooks is incremented by 1. 
 * When a book object is printed, it should output all its attributes in a nice way. 
 * Two books are considered equal if they have the same ISBN. Make sure you have at least one method that uses the object reference this. 
 * Write a client class to test all the methods in your Book class. Also test if two book objects share the same values for publisher and amountOfBooks.
 * 
 * @author Jeremie Guerchon
 */


public class aBook {
    static String publisher = "Vanier";
    static int amountOfBooks = 0;
    String title;
    String author;
    int ISBN;
    int yearOfPub;

    public void aBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.ISBN = 0;
        this.yearOfPub = 0;
        amountOfBooks++;
    }
    
    public aBook(String newTitle, String newAuthor, int newISBN, int newYearOfPub, String publisher) {

        this.title = newTitle;
        this.author = newAuthor;
        this.ISBN = newISBN;
        this.yearOfPub = newYearOfPub;
        this.publisher = publisher;
        amountOfBooks++;

    }
        public String getTitle() {
            return title;
        }

        public int getISBN() {
            return ISBN;
        }

        
        public int getYearOfPub() {
            return yearOfPub;
        }
        
        public String getPublisher() {
            return publisher;
        }
        
        public String getAuthor() {
            return author;
        }

    public static void main(String[] args) {
 
        aBook ISBN;
        
        Integer ISBN1 = 0;
        Integer ISBN2 = 1;

        if (ISBN1.equals(ISBN2)) {
            System.out.println("This is the same book.");
        } else {

        }

        aBook book1 = new aBook("author","title",1000,100,publisher);

        System.out.println(book1);


      
    }
}
