import java.util.ArrayList;

public class User {

    private String username ;
    private String email;
    private ArrayList<Media> purchased_MediaList;
    private ArrayList<Media> shopping_Cart;


    public User(String username,String email,  ArrayList<Media> purchased_MediaList,ArrayList<Media> shopping_Cart ) {
        this.username=username;
        this.email = email;
        this.purchased_MediaList = purchased_MediaList;
        this.shopping_Cart = shopping_Cart;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchased_MediaList(ArrayList<Media> purchased_MediaList) {
        this.purchased_MediaList = purchased_MediaList;
    }

    public void setShopping_Cart(ArrayList<Media> shopping_Cart) {
        this.shopping_Cart = shopping_Cart;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public ArrayList<Media> getPurchased_MediaList() {
        return purchased_MediaList;
    }

    public ArrayList<Media> getShopping_Cart() {
        return shopping_Cart;
    }

    public String getUsername() {
        return username;
    }

public void addToCart(Media media){
shopping_Cart.add(media);

    }


    public void remove_FromCart(Media media) {
        shopping_Cart.remove(media);

    }



   public void checkOut(){
        /// the stock is in the book class

       for (int i = 0; i < shopping_Cart.size(); i++) {
           Media m = shopping_Cart.get(i);
           if (m instanceof Book) {
               Book b = (Book) m;
               b.purchase(this);

           } else if (purchased_MediaList.contains(m)) {
               System.out.println("This item has already been purchased");
           } else
           {
               purchased_MediaList.add(m);
           }
           shopping_Cart.remove(i);
           i--;

       }

       System.out.println("the items has been purchased !");

   }



}





