public class IntentDetector {

    public String detectIntent(String userInput) {
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "greeting";
        } else if (userInput.contains("help") || userInput.contains("support")) {
            return "help";
        } else if (userInput.contains("bye")) {
            return "farewell";
        } else if (userInput.contains("weather")) {
            return "weather";
        } else {
            return "unknown";
        }
    }
}
