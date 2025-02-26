import java.util.ArrayList;

public class Movie extends Media{

private int duration;


    public Movie(String author, String ISBN, double price, String title, int duration) {
        super(author, ISBN, price, title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

public void watch(User user )
{
    user.getPurchased_MediaList().add(this);
}

public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> moiveCatalog){
    ArrayList<Movie> recList=new ArrayList<>();
    for (int i = 0; i < moiveCatalog.size(); i++) {
         if (moiveCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())&& ! moiveCatalog.get(i).equals(this)){
             recList.add(moiveCatalog.get(i));
         }
    }

    return recList;
}


    @Override
    public String getMedia() {
        if(duration >=120){
            return"Long Movie";
        }else return "Movie";
    }


    @Override
    public String toString() {
        return "Movie\n" +
                "duration= " + duration ;
    }
}
