import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class MyChatbot {

    private static final Map<String, String> responses = new HashMap<>();
    private static final String[] jokes = {
        "Why don't scientists trust atoms? Because they make up everything!",
        "Why did the scarecrow win an award? Because he was outstanding in his field!",
        "I told my wife she was drawing her eyebrows too high. She looked surprised!",
        "Why don’t skeletons fight each other? They don’t have the guts.",
        "What do you call fake spaghetti? An impasta!",
        "Why can't you give Elsa a balloon? Because she will let it go!",
        "Why did the coffee file a police report? It got mugged!",
        "Why don’t eggs tell jokes? They might crack up!",
        "How does a penguin build its house? Igloos it together!",
        "What do you call cheese that isn't yours? Nacho cheese!"
    };

    private static final String[] facts = {
        "Did you know? Honey never spoils.",
        "Bananas are berries, but strawberries aren't!",
        "Octopuses have three hearts and blue blood.",
        "There are more stars in the universe than grains of sand on all the world's beaches.",
        "Sharks have been around longer than trees."
    };

    private static final String[] medicalFacts = {
        "The human body contains about 37.2 trillion cells.",
        "The average human brain has about 86 billion neurons.",
        "Your heart beats over 100,000 times a day.",
        "The human nose can detect about 1 trillion different smells.",
        "Your skin is the largest organ of your body."
    };

    private static final String[] healthyTips = {
        "Drink plenty of water to stay hydrated throughout the day.",
        "Exercise regularly to maintain physical and mental health.",
        "Get enough sleep; adults need about 7-9 hours of sleep per night.",
        "Eating a balanced diet with fruits and vegetables is key to good health.",
        "Take short breaks during work to avoid eye strain and stress."
    };

    private static final String[] mathFacts = {
        "Did you know? Zero is the only number that can't be represented in Roman numerals.",
        "A 'googol' is the number 1 followed by 100 zeroes.",
        "Pi is an irrational number, which means it cannot be expressed as a fraction.",
        "The number 'e' is known as Euler's number, and it is approximately 2.71828.",
        "Multiplying any number by 9 will result in digits that add up to 9 (e.g., 9 x 3 = 27, 2 + 7 = 9)."
    };

    private static final String[] cookingFacts = {
        "Did you know? The sharpest knife in the kitchen should be the chef's knife.",
        "Adding salt to water increases its boiling point.",
        "Honey is the only food that never spoils.",
        "Potatoes were the first food to be grown in space.",
        "An egg can float in water if it’s old enough due to air pockets inside."
    };

    private static final String[] codingFacts = {
        "Did you know? The first computer programmer was Ada Lovelace, who worked in the 1800s.",
        "The first high-level programming language was Fortran, developed in the 1950s.",
        "The first computer virus was created in 1986 and was called 'Brain'.",
        "There are over 700 different programming languages.",
        "Python is named after the comedy group Monty Python, not the snake!"
    };

    static {
        responses.put("hi", "Hello! How can I help you today?");
        responses.put("hello", "Hi! What would you like to talk about?");
        responses.put("how are you", "I'm doing well, thank you! How are you?");
        responses.put("what is your name", "I'm your friendly chatbot!");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("what can you do", "I can chat with you, tell jokes, share interesting facts, medical facts, health tips, math facts, cooking facts, and coding facts. Just ask!");
        responses.put("thank you", "You're welcome! I'm glad I could help.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Chatbot: Hello! I am your chatbot. You can talk to me. I will share jokes,facts,medical facts,coding facts,cooking facts,math facts , healthy tips...");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();  

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: " + responses.get("bye"));
                break;
            }

            if (userInput.contains("joke")) {
                int jokeIndex = random.nextInt(jokes.length);
                System.out.println("Chatbot: " + jokes[jokeIndex]);

            } else if (userInput.contains("fact")) {
                int factIndex = random.nextInt(facts.length);
                System.out.println("Chatbot: " + facts[factIndex]);

            } else if (userInput.contains("medical fact")) {
                int medicalFactIndex = random.nextInt(medicalFacts.length);
                System.out.println("Chatbot: " + medicalFacts[medicalFactIndex]);

            } else if (userInput.contains("healthy tip")) {
                int healthyTipIndex = random.nextInt(healthyTips.length);
                System.out.println("Chatbot: " + healthyTips[healthyTipIndex]);

            } else if (userInput.contains("math fact")) {
                int mathFactIndex = random.nextInt(mathFacts.length);
                System.out.println("Chatbot: " + mathFacts[mathFactIndex]);

            } else if (userInput.contains("cooking fact")) {
                int cookingFactIndex = random.nextInt(cookingFacts.length);
                System.out.println("Chatbot: " + cookingFacts[cookingFactIndex]);

            } else if (userInput.contains("coding fact")) {
                int codingFactIndex = random.nextInt(codingFacts.length);
                System.out.println("Chatbot: " + codingFacts[codingFactIndex]);

            } else if (responses.containsKey(userInput)) {
                System.out.println("Chatbot: " + responses.get(userInput));

            } else {
                System.out.println("Chatbot: I'm sorry, I didn't understand that. Can you try asking something else?");
            }
        }
    }
}
