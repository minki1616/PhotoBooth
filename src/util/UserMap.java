package util;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import model.User;

public class UserMap {
    private final Map<String, User> userMap = new HashMap<>();

    public void addUser(String userID, User user) {
       userMap.put(userID,user);
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
    public User getUser(String userID){
        try{
           return userMap.get(userID);
        }
        catch(Exception e){
            Logging.logger.log(Level.INFO, "Error while getting user - " +userID +e);
            e.printStackTrace();
        }
        return null;
    }
}
