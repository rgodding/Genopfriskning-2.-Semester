package Opgave7;

import java.util.ArrayList;

public class Søgning {

    public int search(ArrayList<String> list, String word){
        return list.indexOf(word);
    }

    public static void main(String[] args){
        Søgning soeg = new Søgning();
        ArrayList<String> list = new ArrayList<>();
        list.add("Æble");
        list.add("Banan");
        list.add("Pære");
        list.add("Kat");
        list.add("Hund");
        String word = "Banan";

        System.out.println("index position: " + soeg.search(list,word));
    }
}
