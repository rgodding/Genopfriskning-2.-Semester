package Opgave4;

public class Kvadrat {

    public void printSquare(int amount, char sign){
        String width = "";
        int amount2 = amount;

        while(amount2 > 0){
            if(amount2 != 1) {
                width += sign + "  ";
            } else {
                width += sign;
            }
            amount2--;
        }
        while(amount > 0){
            System.out.println(width);
            amount--;
        }
    }

    public static void main(String[] args){
        Kvadrat kv = new Kvadrat();
        kv.printSquare(4, 'X');
    }
}
