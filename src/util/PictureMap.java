package util;

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
        try{
            return pictureMap.get(pictureID);
        }
        catch(Exception e){
            Logging.logger.log(Level.INFO, "Error while getting user - " +pictureID +e);
            e.printStackTrace();
        }
        return null;
    }
}
