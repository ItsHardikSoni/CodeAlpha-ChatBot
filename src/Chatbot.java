import java.util.Scanner;

public class Chatbot {
    private final NLPProcessor nlpProcessor;
    private final IntentDetector intentDetector;
    private final ResponseGenerator responseGenerator;

    public Chatbot() {
        this.nlpProcessor = new NLPProcessor();
        this.intentDetector = new IntentDetector();
        this.responseGenerator = new ResponseGenerator();
    }

    public void startChat() {
        System.out.println("Hello! I’m your chatbot. How can I assist you today?");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String processedInput = nlpProcessor.processText(userInput);
            String intent = intentDetector.detectIntent(processedInput);
            String response = responseGenerator.generateResponse(intent, userInput);

            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();
        chatbot.startChat();
    }
}
