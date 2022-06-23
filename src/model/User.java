package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userId;
    private String name;
    private final List<User> followers = new ArrayList<>();
    public User(String userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getUserId(){
        return userId;
    }
    public void addFollowers(User user) {
        followers.add(user);
    }
    public List<User> getFollowers() {
        return followers;
    }
}
