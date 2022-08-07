package AlfredBot;

public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();


        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Martin billingsham");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String testJeopardyAnnouncement = alfredBot.jeopardyAnnouncement(); // Added method!

        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Hey Alexis! Play the cult classic film, clerks."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "Alfred is actually so rude. I cant even speak before this freaking guy.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "I wonder how many hot dogs I could ACTUALLY eat."
        );

        // Print the greetings to test.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(testJeopardyAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}
