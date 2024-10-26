public class ResponseGenerator {

    public String generateResponse(String intent, String userInput) {
        switch (intent) {
            case "greeting":
                return "Hello! How can I help you today?";
            case "help":
                return "I can assist you with questions about the weather, general inquiries, or chatting!";
            case "farewell":
                return "Goodbye! Have a great day!";
            case "weather":
                return "I'm currently unable to provide real-time weather, but you can check weather.com!";
            default:
                return "I'm not sure how to respond to that. Could you please clarify?";
        }
    }
}
