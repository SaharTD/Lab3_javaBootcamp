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
    System.out.println("The movie :"+this.getTitle()+"is added to watch in your purchased list successfully. ");
    user.getPurchased_MediaList().add(this);
}

public void recommendSimilarMovies(ArrayList<Movie> moiveCatalog){
    ArrayList<Movie> recList=new ArrayList<>();
    for (int i = 0; i < moiveCatalog.size(); i++) {
         if (moiveCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())&& ! moiveCatalog.get(i).equals(this)){
             recList.add(moiveCatalog.get(i));
         }
    }
    System.out.println("The similar movies to the movie :  "+this.getTitle()+" is :\n"+recList);
}


    @Override
    public String getMedia() {
        if(duration >=120){
            return"Long Movie";
        }else return "Movie";
    }


    @Override
    public String toString() {
        return "\n Movie name : \n" +this.getTitle()+
                "\n duration in minuets ="+ duration ;
    }
}
