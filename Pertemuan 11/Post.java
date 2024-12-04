import java.util.ArrayList;
import java.util.List;

public class Post {
    private User author;
    private String content;
    private List<User> likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void addLike(User user) {
        likes.add(user);
        if (!likes.contains(user)) {
            System.out.println(user.getUsername() + " liked: " + content);
        }
    }

    public int getLikeCount() { return likes.size(); }
}
