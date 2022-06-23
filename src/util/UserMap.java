package util;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import model.User;

public class UserMap {
    private final Map<String, User> userMap = new HashMap<>();

    public void addUser(String userId, User user) {
       userMap.put(userId,user);
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
    public User getUser(String userID){
        User user = null;
        try{
            user = userMap.get(userID);
           if(user == null)
               throw new InvalidParameterException("Invalid userID");
        }
        catch(Exception e){
            Logging.logger.log(Level.SEVERE, "Error while getting user - " +userID +e);
            e.printStackTrace();
        }
        return user;
    }
}
