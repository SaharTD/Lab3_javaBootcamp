import java.util.ArrayList;

public class Novel extends Book{
    String genre;

    public Novel(String author, String ISBN, double price, String title, ArrayList<Review> review, int stock, String genre) {
        super(author, ISBN, price, title, review, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMedia() {
        if (this.getAverageRating()>=4.5){
            return "Bestselling Novel";
        }else return "Novel";
    }


    @Override
    public String toString() {
        return "Novel\n" +
                "genre='" + genre;
    }
}
