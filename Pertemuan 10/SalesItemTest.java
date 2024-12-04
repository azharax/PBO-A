
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SalesItemTest {

    @Test
    public void testAddCommentAndCount() {
        SalesItem item = new SalesItem("Java Book", 12345);
        assertTrue(item.addComment("Alice", "Great book!", 4));
        assertTrue(item.addComment("Bob", "Not bad", 3));

        assertEquals(2, item.getNumberOfComments());
    }

    @Test
    public void testRejectDuplicateAuthor() {
        SalesItem item = new SalesItem("Java Book", 12345);
        assertTrue(item.addComment("Alice", "Fantastic read!", 5));

        assertFalse(item.addComment("Alice", "Changed my mind...", 2));
    }

    @Test
    public void testRejectInvalidRating() {
        SalesItem item = new SalesItem("Java Book", 12345);
        assertTrue(item.addComment("Alice", "Could be better", 3));

        assertFalse(item.addComment("Bob", "Amazing!", -1)); // Rating too low
        assertFalse(item.addComment("Charlie", "Loved it!", 6)); // Rating too high
    }

    @Test
    public void testFindMostHelpfulComment() {
        SalesItem item = new SalesItem("Java Book", 12345);
        item.addComment("Alice", "Great!", 4);
        item.addComment("Bob", "Could be better", 3);

        item.upvoteComment(1);
        item.upvoteComment(1);

        Comment mostHelpful = item.findMostHelpfulComment();
        assertEquals("Bob", mostHelpful.getAuthor());
    }
}