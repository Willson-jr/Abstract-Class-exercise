package Portals;

public class ConstonantWebsite extends Website {

    public ConstonantWebsite(String name){
        super(name);
    }
    public boolean isScored(char ch) {
       return Alphabet.isConsonant(ch);
    }


}
