package handler;

import model.Picture;
import model.User;
import util.PictureMap;
import util.UserMap;

public class Handler {
    private final PictureMap pictureMap;
    private final UserMap userMap;

    public Handler( PictureMap pictureMap, UserMap userMap)
    {
        this.pictureMap=pictureMap;
        this.userMap=userMap;
    }
    public User registerUser(String userID){
        User user1 = new User("user1", "Alpha");
        userMap.addUser("user1", user1);
        return user1;
    }
    public Picture postPicture(String userID, String image){
        User user = userMap.getUser(userID);
        Picture picture = new Picture(image, userID);
        user.addPictures(picture);
        pictureMap.addPicture("image1", picture);
        return picture;
    }
}
