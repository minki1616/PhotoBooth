package util;
import java.util.HashMap;
import java.util.Map;
import model.User;

public class UserMap {
    private Map<String, User> userMap = new HashMap<>();

    public void setUserMap(String userID, User user) {
       userMap.put(userID,user);
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }
}
