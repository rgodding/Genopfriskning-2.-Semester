package Opgave5;

public class ProperCase {

    public String metode(String word){
        String[] letterList = word.split("");
        String result = "";
        if(word.equals(word.toUpperCase())){
            return word;
        }
        if(word.length() > 3){
            result += letterList[0].toUpperCase();
            for(int i = 1; i < letterList.length; i++){
                result += letterList[i].toLowerCase();
            }
            return result;
        } else {
            for (String s : letterList) {
                result += s.toLowerCase();
            }
        }
        return result;
    }

}
