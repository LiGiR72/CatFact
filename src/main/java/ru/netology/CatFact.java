package ru.netology;

public class CatFact {
    String id;
    String text;
    String type;
    String user;
    Integer upvotes;

    public CatFact(String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public CatFact() {
    }

    @Override
    public String toString() {

        return ("{ id = " + id +
                "\ntext = \"" + text +
                "\"\ntype = \"" + type + "\"\n"
                + "user =  " + user + "\n"
                + "upvotes = " + upvotes + " }");
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }
}
