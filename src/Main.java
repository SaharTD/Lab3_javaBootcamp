import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        User Sahar =new User("ss22@g.com","Ss2002");


        Book book1=new Book("Dalia Saadi","978-3-16-148410-0",80,"Life Story");
        book1.restock(4);
        Movie LSF = new Movie("Kadi","888-4-333333-0",290.75,"Life Story (The film)",100);
        Music LSS = new Music ("Hadi","777-4-333333-0",49,"Life Story (the song)","Jades");


        Sahar.addToCart(book1);
        Sahar.addToCart(LSF);
        Sahar.addToCart(LSS);


        System.out.println("Sahar shopping cart items :\n "+Sahar.getShopping_Cart());
        System.out.println();
Sahar.checkOut();
        System.out.println();
        System.out.println("Sahar shopping cart after being purchased :\n "+Sahar.getShopping_Cart());

Review review=new Review("Very good moive",5,"Ss2002");

book1.addReview(review);
book1.isBestseller();





    }
}
