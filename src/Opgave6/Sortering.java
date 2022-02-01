package Opgave6;

import java.util.ArrayList;
import java.util.Scanner;

public class Sortering {

    public void sortString(int amount){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(amount > 0){
            list.add(sc.nextLine());
            amount--;
        }

        list.sort(this::compareTo);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public int compareTo(String o1, String o2){
        return o2.compareTo(o1);
    }

    public static void main(String[] args){
        Sortering sor = new Sortering();
        sor.sortString(5);
    }
}
