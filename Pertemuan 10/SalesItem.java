import java.util.ArrayList;

public class SalesItem {
    private String name;
    private int price; // in cents
    private ArrayList<Comment> comments;

    public SalesItem(String name, int price) {
        this.name = name;
        this.price = price;
        this.comments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfComments() {
        return comments.size();
    }

    public boolean addComment(String author, String text, int rating) {
        if (rating < 0 || rating > 5) return false; // Reject invalid rating
        if (findCommentByAuthor(author) != null) return false; // Reject duplicate author

        comments.add(new Comment(author, text, rating));
        return true;
    }

    public void removeComment(int index) {
        if (isValidIndex(index)) {
            comments.remove(index);
        }
    }

    public void upvoteComment(int index) {
        if (isValidIndex(index)) {
            comments.get(index).upvote();
        }
    }

    public void downvoteComment(int index) {
        if (isValidIndex(index)) {
            comments.get(index).downvote();
        }
    }

    public void showInfo() {
        System.out.println("*** " + name + " ***");
        System.out.println("Price: " + formatPrice(price));
        System.out.println("\nCustomer Comments:");

        for (Comment comment : comments) {
            System.out.println("-----------------------------------");
            System.out.println(comment.getFullDetails());
        }
        System.out.println("=====================================");
    }

    public Comment findMostHelpfulComment() {
        if (comments.isEmpty()) return null;

        Comment mostHelpful = comments.get(0);
        for (Comment comment : comments) {
            if (comment.getVoteCount() > mostHelpful.getVoteCount()) {
                mostHelpful = comment;
            }
        }
        return mostHelpful;
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < comments.size();
    }

    private Comment findCommentByAuthor(String author) {
        for (Comment comment : comments) {
            if (comment.getAuthor().equals(author)) {
                return comment;
            }
        }
        return null;
    }

    private String formatPrice(int price) {
        int dollars = price / 100;
        int cents = price % 100;
        return String.format("$%d.%02d", dollars, cents);
    }
}