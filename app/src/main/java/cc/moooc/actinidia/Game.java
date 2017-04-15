package cc.moooc.actinidia;

/**
 * Game
 */

public class Game {
    private String name;
    private String description;
    private String author;
    private String date;
    private String version;
    private int star;
    private String key;
    private int size;

    public Game(String name, String description, String author, String date,
                String version, int star, String key, int size) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.date = date;
        this.version = version;
        this.star = star;
        this.key = key;
        this.size = size;
    }
}