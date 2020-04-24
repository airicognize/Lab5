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


        public String toString() {
            
            String book = "";
            book += "\nTitle of the book>> " + this.title; 
            book += "\nAuthor of the book>> " + this.author;
            book += "\nISBN of the book>> " + this.ISBN;
            book += "\nPublisher of the book>> " + this.publisher;
            book += "\nYear of publication of " + title + ">>" + this.yearOfPub;
            return book;
        }

        public boolean equals(aBook book1) {
            if (this.ISBN == book1.ISBN) {
                return true;
            } else {
                return false;
            }
        }


    public static void main(String[] args) {
 

        aBook book1 = new aBook("redz"," jerem",1000,100,publisher);

        aBook book2 = new aBook("lblo","blz",2220,103,publisher);
        

        System.out.println(book1);

        System.out.println(book2);


        System.out.println("\nAmount of books " + amountOfBooks);


      
    }
}
