package AlfredBot;
import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello,lovely to see you. How are you?";
    }
    public String guestGreeting(String name) {
        return String.format("Good evening,"+ name);
    }
    public String dateAnnouncement() {
        return String.format("todays date is,"+ new Date());
    }
    public String jeopardyAnnouncement() {
        return String.format("Hi! Lets play Jeopardy, but if I win you have to release me.");
    } //Added method inspired by my google home assistant

    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "She's on her break right now, lets see if I can help!";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "Alfredbot at your service!";
        }
        return "See you later!!";
    }
    
    public String testGuestOverload(int i) {
        return null;
    }
}
