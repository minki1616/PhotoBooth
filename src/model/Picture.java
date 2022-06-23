package model;

import java.util.ArrayList;
import java.util.List;
import model.Like;

public class Picture {
    private final  String image;
    private final String userID;
    private List<Like> likes = new ArrayList<>();

    public Picture(String image, String userID){
        this.image = image;
        this.userID = userID;
    }

    public String getImage() {
        return image;
    }

    public String getUserID() {
        return userID;
    }
    public void addLike(String userID){
        Like newLike = new Like(userID, this.image);
        this.likes.add(newLike);
    }

    public List<Like> getLikes(){
        return  this.likes;
    }
}
