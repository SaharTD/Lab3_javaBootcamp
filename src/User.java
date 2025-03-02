import java.util.ArrayList;

public class User {

    private String username ;
    private String email;
    private ArrayList<Media> purchased_MediaList;
    private ArrayList<Media> shopping_Cart;

    public User(String email, String username) {
        this.email = email;
        this.username = username;
        this.purchased_MediaList = new ArrayList<Media>();
        this.shopping_Cart = new ArrayList<Media>();
    }

    public User(String username, String email, ArrayList<Media> purchased_MediaList, ArrayList<Media> shopping_Cart ) {
        this.username=username;
        this.email = email;
        this.purchased_MediaList = new ArrayList<Media>();
        this.shopping_Cart = new ArrayList<Media>();
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
        if (this.shopping_Cart.contains(media)) {
            System.out.println(media.getTitle()+"this item has been already added to the cart");
        }else {
            this.shopping_Cart.add(media);
            System.out.println("\n the item :" + media.getTitle() + " has been added successfully ");
        }
}


    public void remove_FromCart(Media media) {
       this.shopping_Cart.remove(media);

    }



   public void checkOut(){
        /// the stock is in the book class

       for (int i = 0; i < this.shopping_Cart.size(); i++) {
           Media m = this.shopping_Cart.get(i);
           if (m instanceof Book) {
               Book b = (Book) m;
               b.purchase(this);

           } else if (this.purchased_MediaList.contains(m)) {
               System.out.println("This item has already been purchased");
           } else
           {
               this.purchased_MediaList.add(m);
           }
           this.shopping_Cart.remove(i);
           i--;
           System.out.println("the items has been purchased successfully !");

       }


   }



}





