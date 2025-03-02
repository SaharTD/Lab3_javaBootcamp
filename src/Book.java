import java.util.ArrayList;

public class Book extends Media{


    private int quantityIn_stock;
    private ArrayList<Review> review;


    public Book(String auteur, String ISBN, double price, String title) {
        super(auteur, ISBN, price, title);
        this.review = new ArrayList<Review>();
        this.quantityIn_stock = quantityIn_stock;
    }

    public Book(String author, String ISBN, double price, String title, ArrayList<Review> review, int quantityIn_stock) {
        super(author, ISBN, price, title);
        this.review = new ArrayList<Review>();
        this.quantityIn_stock = quantityIn_stock;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }
    //we have to set an array list before we add

    public ArrayList<Review> getReview() {
        return review;
    }



    public void setQuantityIn_stock(int quantityIn_stock) {
        this.quantityIn_stock = quantityIn_stock;
    }

    public int getQuantityIn_stock() {
        return quantityIn_stock;
    }

public void addReview (Review r){
    review.add(r);

    }

public double getAverageRating(){
        double Rate_count=0;
        double Rate_sum=0;

    for (int i = 0; i < this.review.size(); i++) {
        Rate_sum +=this.review.get(i).getRating();
           Rate_count++;
       }

    if (Rate_count==0){
        System.out.println("There are no review! ");
       return 0.0;
    }

    double average =Rate_sum/Rate_count;
    return average;
}


public void purchase(User user){

        if ( user.getPurchased_MediaList().contains(this)){
            System.out.println("The item is already in the cart! ");
        }else {
            if(quantityIn_stock>0){
            user.getPurchased_MediaList().add(this);
          quantityIn_stock--;
          System.out.println(this.getTitle()+"The purchase was made successfully");

            }else System.out.println("Sorry we are out of stock!");

        }

}

public boolean isBestseller(){
        if (this.getAverageRating() >= 4.5){
            System.out.println(this.getAverageRating()+"Is the bestseller book ");
    return true;
        }else
            System.out.println(this.getAverageRating()+"is not the best selling book");
            return false;
}


public void restock (int quantity){
        if (quantity>0){
    quantityIn_stock+=quantity;
            System.out.println("Restocked successfully ");
        }else System.out.println("please enter a correct positive number ! ");

}

    public String getMedia (  ){
if (this.isBestseller()){
    return "Bestselling Book";
}
        return "Book";
    }

    @Override
    public String toString() {
        return "\n Book : \n" +this.getTitle();
    }
}





