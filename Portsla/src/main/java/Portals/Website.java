package Portals;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public abstract class Website {
    private String name;

    public void displayMessage(String message) {
        // opis
        System.out.print("( "+name+", "+getNumberOfPoints(message)+") informs: ");
        /*
        punktowane litery robimy duzymi literami
        te ktore nie sa punktowane bez zmian
        */
        for (int i = 0; i < message.length() ; i++) {
            if (isScored(message.charAt(i))){
                String m =""+message.charAt(i);
                System.out.print(m.toUpperCase());
            } else {
                String m =""+message.charAt(i);
                System.out.print(m.toLowerCase());
            }
        }
        System.out.println();
}

    public int getNumberOfPoints(String message) {
        int score = 0;
        for (int i = 0; i < message.length(); i++) {
            if (isScored(message.charAt(i))) score++;
        }
        return score;
    }

    public abstract boolean isScored(char letter);


}
