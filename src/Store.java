import java.util.ArrayList;

public class Store {



   private ArrayList<User> user;
   private   ArrayList<Media>media;


    public Store(ArrayList<User> user, ArrayList<Media>media) {
        this.user = user;
        this.media = media;
    }

    public ArrayList<User>  getUser() {
        return user;
    }

    public void setUser (ArrayList<User> user) {
        this.user = user;
    }

    public  ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia( ArrayList<Media>media) {
        this.media = media;
    }


    public void addUser ( User u ) {

        for (int i = 0; i < user.size(); i++) {
            if (!checkUser(u)) {
                System.out.println("no user found !");
            } else if (checkUser(u)) {
                user.add(u);
            }
        }
    }

        public ArrayList<User>  displayUser () {
            return this.user;
        }

        public void addMedia (Media media ){
            for (int i = 0; i < this.media.size(); i++) {
                this.media.add(media);
            }

        }

        public  ArrayList<Media> displayMedia () {

            return this.media;
        }

        public Book SearchBook (String title){

            return null;
        }


        public boolean checkUser (User user ){
            return user.equals("null");
        }




}
