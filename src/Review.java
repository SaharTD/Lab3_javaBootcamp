public class Review {

    private String username ;
    private double rating ;
    private String comment;


    public Review(String comment, double rating, String username) {
        this.comment = comment;
        this.rating = rating;
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "\nReview" +
                "\nThe comment : " + comment +
                "\n by username :" + username +
                "\n with rating :" + rating;
    }
}
public class Review {

    private String username ;
    private double rating ;
    private String comment;


    public Review(String comment, double rating, String username) {
        this.comment = comment;
        this.rating = rating;
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "\nReview" +
                "\nThe comment : " + comment +
                "\n by username :" + username +
                "\n with rating :" + rating;
    }
}
