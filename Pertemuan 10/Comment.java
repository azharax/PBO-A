public class Comment {
    private String author;
    private String text;
    private int rating;
    private int votes;

    public Comment(String author, String text, int rating) {
        this.author = author;
        this.text = text;
        this.rating = rating;
        this.votes = 0;
    }

    public String getAuthor() {
        return author;
    }

    public int getVoteCount() {
        return votes;
    }

    public void upvote() {
        votes++;
    }

    public void downvote() {
        votes--;
    }

    public String getFullDetails() {
        return String.format("Author: %s\nRating: %d\nVotes: %d\nComment: %s", 
                              author, rating, votes, text);
    }
}
