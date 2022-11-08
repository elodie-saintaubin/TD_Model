package tddstart;

import java.util.*;

//test git
public class Dictionary {
    private String name;
    private Map<String, String> translations = new HashMap<>();

    private ArrayList<Map<String, String>> dictionnaire;

    Dictionary(String name){ this.name = name;}
    public Dictionary(){
        this.name = "default";
    }

    public Dictionary(Map<String, String> d){
        this.translations = d;
    }

    public Dictionary(ArrayList<Map<String, String>> d){
        this.dictionnaire = d;
    }

    //public String getName(){return "Example";};
    public String getName(){return this.name;}


    public void addTranslation(String word, String translation){
        this.translations.put(word, translation);
    }
    public String getTranslation(String word){
        if(this.translations == null)
            return null;
        return translations.get(word);
    }


    //2) Add sans get : Non
    //3) Get sans add : oui partiellement à condition que ce soit un mock
    public boolean isEmpty(){
        //TODO
        return true;
    }


}
