import handler.Handler;
import java.util.Map;
import model.Picture;
import model.User;
import util.Logging;
import util.PictureMap;
import util.UserMap;

public class Driver {

    public static void main(String[] args)
    {
        PictureMap pictureMap = new PictureMap();
        UserMap userMap = new UserMap();
        Handler handler = new Handler(pictureMap, userMap);

        User user1 = handler.registerUser("user1");
        Picture picture1 = handler.postPicture("user1", "image1");
        picture1.addLike("user1");

        Map<String, Picture> map =  pictureMap.getPictureMap();
        for(String itr: map.keySet()){
            System.out.println("Picture - " + itr);
        }
    }
}
