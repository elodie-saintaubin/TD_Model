package tddstart;

import java.util.*;

public class Dictionary {
    private String nom;
    Dictionary(String nom){
        this.nom = nom;
    }
    Dictionary(){
        this.nom = "default";
    }

    public String getName(){
        return this.nom;
    }

    public void addTranslation(String word, String translation){

    }

    public String getTranslation(String word){
        //TODO
        return "";
    }

    public boolean isEmpty(){
        //TODO
        return true;
    }


}
