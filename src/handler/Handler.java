package handler;

import static util.Logging.logger;
import java.util.logging.Level;
import model.Picture;
import model.User;
import util.PictureMap;
import util.UserMap;

public class Handler {
    private final PictureMap pictureMap;
    private final UserMap userMap;

    public Handler( PictureMap pictureMap, UserMap userMap) {
        this.pictureMap=pictureMap;
        this.userMap=userMap;
    }

    public User registerUser(String userID, String name){
        logger.log(Level.INFO, "Register user with User ID: " + userID);
        User user = new User(userID, name);
        userMap.addUser(userID, user);
        return user;
    }

    public Picture postPicture(String userID, String image){
        logger.log(Level.INFO, "Post Picture for User: " +userID + ", Image Id: "+ image);
        User user = userMap.getUser(userID);
        Picture picture = new Picture(image, userID);
        user.addPictures(picture);
        pictureMap.addPicture(image, picture);
        return picture;
    }
}
