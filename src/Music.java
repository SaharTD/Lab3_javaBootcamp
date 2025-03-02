import java.util.ArrayList;

public class Music extends Media {
    private String artist;


    public Music(String author, String ISBN, double price, String title, String artist) {
        super(author, ISBN, price, title);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public void listen(User user) {
user.getPurchased_MediaList().add(this);
    }

    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog) {


        ArrayList<Music> musicRecList=new ArrayList<>();
        for (int i = 0; i < musicCatalog.size(); i++) {
            if (musicCatalog.get(i).getAuteur().equalsIgnoreCase(this.getAuteur())&& ! musicCatalog.get(i).equals(this)){
                musicRecList.add(musicCatalog.get(i));
            }
        }

        System.out.println("The similar songs to the song :  "+this.getTitle()+" are :\n");
        return musicRecList;
    }

    @Override
    public String getMedia() {
        if (this.getPrice()>=10){
            return "Premium Music";
        }
        return "Music";
    }

    @Override
    public String toString() {
        return "\nMusic : \n" + this.getTitle()+
                "\n artist : \n" + artist +"\n";
    }
}
