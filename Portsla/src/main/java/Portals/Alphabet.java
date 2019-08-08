package Portals;

public class Alphabet {
    public static boolean isVowel(char ch) {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                ch=='u' || ch=='U')
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static boolean isConsonant(char ch){
        return !isVowel(ch);
    }
    public static boolean isCustom(char ch) {

        if(ch=='a' || ch=='A' || ch=='B' || ch=='b' ||
                ch=='c' || ch=='C' || ch=='e' || ch=='E' ||
                ch=='f' || ch=='F'|| ch=='g'|| ch=='G'|| ch=='h'|| ch=='H'
                || ch=='i'|| ch=='I'|| ch=='j'|| ch=='J'|| ch=='k'|| ch=='K')
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
