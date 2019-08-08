package Portals;

public class CustomWebsite extends Website{
    /*
    Nie jst dziedziczony konstruktor
     */
    public CustomWebsite(String name){
        super(name); //wywolanie konstruktora z klasyy po ktorej porzidziczylismy
    }
    public boolean isScored(char ch) {
        if ((ch>='a' && ch<='k' )|| (ch>='A' && ch<='K'))return true;
        else return false;
    }
}
