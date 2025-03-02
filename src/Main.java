import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        User Sahar =new User("ss22@g.com","Ss2002");


        Book book1=new Book("Dalia Saadi","978-3-16-148410-0",80,"Life Story(the book)");
        book1.restock(4);
        Movie LSF = new Movie("Kadi","888-4-333333-0",290.75,"Life Story (The film)",100);
        Music LSS = new Music ("Hadi","777-4-333333-0",49,"Life Story (the song)","Jades");

        System.out.println("Adding to the cart items to the cart :");
        System.out.println();
        Sahar.addToCart(book1);
        Sahar.addToCart(LSF);
        Sahar.addToCart(LSS);
        System.out.println("");
        Sahar.addToCart(book1);

        System.out.println();

        System.out.println("Sahar shopping cart items :\n "+Sahar.getShopping_Cart());
        System.out.println();
        Sahar.checkOut();
        System.out.println();
        System.out.println("Sahar shopping cart after being purchased :\n "+Sahar.getShopping_Cart());

        System.out.println("----------------------------------------");

        /// review class test
Review review1= new Review("Very good movie",5,"Ss2002");
Review review2= new Review("Quite nice movie",4,"Ss2002");
Review review3= new Review("Great movie",4.5,"Ss2003");

      /// book class test

//ArrayList<Review>book_eviews = new ArrayList<>();
//book1.setReview(book_eviews);
//        book_eviews.add(review1);
//        book_eviews.add(review2);
//        book_eviews.add(review3);
//        System.out.println(book1.getReview());
        System.out.println("Life Story book - The quantity in the stock : "+book1.getQuantityIn_stock());
        System.out.println();
book1.addReview(review1);
book1.addReview(review2);
book1.addReview(review3);

System.out.println("\n The review on the book :"+book1.getReview());

        System.out.println("----------------------------------------");
/// the movie class test

        System.out.println("The duration of the film  "+LSF.getTitle()+" is :"+LSF.getDuration()+"minutes");
        System.out.println();
        ArrayList<Movie> moviesList=new ArrayList<>();
        Movie LSF2 = new Movie("Kadi","888-4-22222222-0",280.75,"Love story",100);
        Movie LSF3 = new Movie("Dena","888-4-77777777-0",220.75,"Animal Story (The film)",100);
        Movie LSF4 = new Movie("Kadi","888-4-444444-0",100,"Queens story  (The film)",100);
        moviesList.add(LSF2);
        moviesList.add(LSF3);
        moviesList.add(LSF4);

        LSF.recommendSimilarMovies(moviesList);
        System.out.println();
        System.out.println();
LSF2.watch(Sahar);
System.out.println("Sahar purchased list items :\n "+Sahar.getPurchased_MediaList());//love story has been added

        System.out.println("----------------------------------------");










    }
}
