import java.util.ArrayList;

public class AcademicBook extends Book{


    String subject;

    public AcademicBook(String author, String ISBN, double price, String title, ArrayList<Review> review, int stock, String subject) {
        super(author, ISBN, price, title, review, stock);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getMedia() {
        if (this.getAverageRating()>=4.5){
            return "Bestselling AcademicBook";
        }else return "AcademicBook";
    }


    @Override
    public String toString() {
        return "AcademicBook\n" +
                "subject='" + subject ;
    }
}
