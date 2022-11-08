package tddstart;

import java.util.*;

//test git
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
    //2) Add sans get : Non
    //3) Get sans add : oui partiellement à condition que ce soit un mock
    public boolean isEmpty(){
        //TODO
        return true;
    }


}
