package tddstart;

import java.util.*;

//test git
public class Dictionary {
    private String name;
    private Map<String, String> translations;

    Dictionary(String nom){ this.name = nom;}
    Dictionary(){
        this.name = "default";
    }

    //public String getName(){return "Example";};
    public String getName(){return this.name;}

    public void addTranslation(String word, String translation){
        translations.put(word, translation);
    }

    // Triangulation - q4
    public String getTranslation(String word){
        //TODO
        return translations.get(word);
    }
    //2) Add sans get : Non
    //3) Get sans add : oui partiellement à condition que ce soit un mock
    public boolean isEmpty(){
        //TODO
        return true;
    }


}
