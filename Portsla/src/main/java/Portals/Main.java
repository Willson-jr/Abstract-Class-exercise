package Portals;

public class Main {
    public static void main(String[] args) {
        String firstMessage = "Cows lose their jobs as milk prices drop";
        String secondMessage = "Safety meeting ends in accident";

        Reporter reporter = new Reporter();
        reporter.addWebsite(new VowelWebsite("Vowel news"));
        reporter.addWebsite(new ConstonantWebsite("The constonant"));
        reporter.addWebsite(new CustomWebsite("Custom feed"));

        reporter.broadcastMessage(firstMessage);
        reporter.broadcastMessage(secondMessage);
    }
}
