package util;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import model.Picture;

public class PictureMap {
    private final Map<String, Picture> pictureMap = new HashMap<>();

    public void addPicture(String pictureID, Picture picture) {
         pictureMap.put(pictureID,picture);
    }

    public Map<String, Picture> getPictureMap() {
        return pictureMap;
    }

    public Picture getPicture(String pictureID){
        Picture picture = null;
        try{
            picture = pictureMap.get(pictureID);
            if(picture == null)
                throw new InvalidParameterException("Invalid pictureID");
        }
        catch(Exception e){
            Logging.logger.log(Level.INFO, "Error while getting user - " +pictureID +e);
            e.printStackTrace();
        }
        return picture;
    }
}
