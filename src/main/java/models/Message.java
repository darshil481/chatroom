package models;

public class Message {
    private String name;
    private String content;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Message(String name, String content){
        this.name=name;
        this.content = content;
    }
    public String getContect(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
