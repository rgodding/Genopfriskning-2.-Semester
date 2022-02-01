package Opgave3;

import java.util.Scanner;

public class Grass {
    private double growSpeed = 0.8;

    public int whenToCutGrass(double currentLength, double maxLength){
        int days = 0;
        while(currentLength<maxLength){
            currentLength += growSpeed;
            days++;
        }
        return days;
    }

    public static void main(String[] args){
        Grass grass = new Grass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hvor langt er græsset nu? ");
        double currentLength = sc.nextDouble();
        System.out.print("Hvor langt må græsset være? ");
        double maxLength = sc.nextDouble();

        System.out.println("Græsset skal slås om " + grass.whenToCutGrass(currentLength, maxLength) + " dag(e).." );


    }
}
