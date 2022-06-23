package model;

public class Like {
    private final String userId;
    private final String image;
    public Like(String userId, String image){
        this.userId= userId;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getUserId() {
        return userId;
    }
}
