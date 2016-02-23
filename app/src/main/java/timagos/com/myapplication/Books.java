package timagos.com.myapplication;

/**
 * Created by Lougie on 23/02/2016.
 */
public class Books {
    private String id;
    private String title;
    private String genre;
    private String Author;
    private Boolean isRead;

    public Books(String id, String title, String genre, String author, Boolean isRead) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        Author = author;
        this.isRead = isRead;
    }

    public Books() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }
}
