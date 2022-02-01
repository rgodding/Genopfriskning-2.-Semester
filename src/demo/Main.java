package demo;

import java.util.ArrayList;

public class Main {

    public void start(){
    }


    public boolean doesArraylistContainString(ArrayList<String> list, String text){
        for (String s : list) {
            if (s.equalsIgnoreCase(text)) {
                System.out.println("The String has been found");
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
