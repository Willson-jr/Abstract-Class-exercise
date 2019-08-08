package Portals;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
    private List<Website> websiteList =
            new ArrayList<>();

    public void addWebsite(Website website){
        websiteList.add(website);
    }

    public void broadcastMessage(String msg){
        for (Website website : websiteList) {
            website.displayMessage(msg);
        }
        System.out.println();
    }


}
