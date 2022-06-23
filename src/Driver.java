import service.Service;
import java.util.Map;
import model.Picture;
import model.User;
import util.PictureMap;
import util.UserMap;

// service -> userService, handler -> bookHandler, resources -> registerFactory, bookFactory
public class Driver {

    public static void main(String[] args)
    {
        PictureMap pictureMap = new PictureMap();
        UserMap userMap = new UserMap();
        Service service = new Service(pictureMap, userMap);
        User user1 = service.registerUser("user2","Alpha");
        Picture picture1 = service.postPicture("user2", "image2");
        picture1.addLike("user2");

        Map<String, Picture> map =  pictureMap.getPictureMap();
        for(String itr: map.keySet()){  // To iterate key only
            System.out.println("Picture - " + itr);
        }
        for(Map.Entry<String, Picture> itr: map.entrySet()){  // To iterate key and value
            System.out.println("Picture Key: " + itr.getKey() + ", Value:"+itr.getValue()) ;
        }
    }
}
