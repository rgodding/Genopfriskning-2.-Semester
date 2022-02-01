package Opgave1;

import java.util.ArrayList;

public class OpgaveArray {

    public boolean doesArraylistContainString(java.util.ArrayList<String> list, String text){
        for (String s : list) {
            if (s.equalsIgnoreCase(text)) {
                System.out.println("The String has been found");
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        OpgaveArray aList = new OpgaveArray();
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("ACB");
        list.add("CBA");
        list.add("CAB");
        list.add("BAC");
        list.add("BCA");

        String test = "abc";

        aList.doesArraylistContainString(list, test);

    }
}
