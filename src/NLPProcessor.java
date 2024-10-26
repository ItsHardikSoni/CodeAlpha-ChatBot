import java.util.regex.Pattern;

public class NLPProcessor {

    // Method to preprocess text: convert to lowercase, remove punctuation, and trim whitespace
    public String processText(String text) {
        // Convert text to lowercase
        text = text.toLowerCase();

        // Remove any non-alphanumeric characters (except spaces)
        // Make sure this pattern is correct and doesn't produce errors
        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");

        // Trim leading and trailing whitespace
        return text.trim();
    }
}
