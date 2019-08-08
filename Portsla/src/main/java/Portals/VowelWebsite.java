package Portals;

import lombok.AllArgsConstructor;
public class VowelWebsite extends Website {


    public VowelWebsite(String name){
        super(name);
    }
    public boolean isScored(char ch) {
        return Alphabet.isVowel(ch);
    }
}
