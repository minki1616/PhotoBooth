package model;

public class User {
    private final String userId;
    private String name;
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
}
