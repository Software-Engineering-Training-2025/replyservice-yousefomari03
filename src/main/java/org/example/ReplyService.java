package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // Handle null, empty, or whitespace-only messages
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }


        String msg = message.trim().toLowerCase();

        switch (msg) {
            case "hi":
            case "hello":
                if (type == ReplyType.FORMAL) return "Hello. How may I assist you today?";
                if (type == ReplyType.FRIENDLY) return msg.equals("hi") ?
                        "Hey there! 😊 How can I help?" : "Hi! 👋 What’s up?";
                if (type == ReplyType.CONCISE) return "Hello. How can I help?";
                break;

            case "how are you":
                if (type == ReplyType.FORMAL) return "I am functioning properly. How may I assist you?";
                if (type == ReplyType.FRIENDLY) return "Doing great! 😄 How can I help?";
                if (type == ReplyType.CONCISE) return "I’m good. How can I help?";
                break;

            case "i need help":
                if (type == ReplyType.FORMAL) return "I can assist with that. Please provide more details.";
                if (type == ReplyType.FRIENDLY) return "I’ve got you! 🙂 Tell me a bit more.";
                if (type == ReplyType.CONCISE) return "Share details; I’ll help.";
                break;

            case "can you help me with my account":
                if (type == ReplyType.FORMAL) return "Certainly. Please describe the account issue.";
                if (type == ReplyType.FRIENDLY) return "Sure thing! 😊 What’s wrong with the account?";
                if (type == ReplyType.CONCISE) return "Describe the account issue…";
                break;

            case "thanks":
                if (type == ReplyType.FORMAL) return "You are welcome.";
                if (type == ReplyType.FRIENDLY) return "Anytime! 🙌";
                if (type == ReplyType.CONCISE) return "You’re welcome.";
                break;

            case "bye":
                if (type == ReplyType.FORMAL) return "Goodbye.";
                if (type == ReplyType.FRIENDLY) return "See you later! 👋";
                if (type == ReplyType.CONCISE) return "Goodbye.";
                break;

            case "what is your name":
                if (type == ReplyType.FORMAL) return "I am your virtual assistant.";
                if (type == ReplyType.FRIENDLY) return "I’m your helper bot 🤖";
                if (type == ReplyType.CONCISE) return "I’m your assistant.";
                break;

            default:
                if (type == ReplyType.FORMAL) return "Could you clarify your request?";
                if (type == ReplyType.FRIENDLY) return "Could you tell me more?";
                if (type == ReplyType.CONCISE) return "Please clarify.";
        }

        return "Please say something.";
    }
}



// TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.
        // - throw new UnsupportedOperationException("Not implemented yet");

