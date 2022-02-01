package Opgave2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> books = new ArrayList<>();

    public boolean checkBook(Bog book){
        for (Bog b : books) {
            if(b.getIsbnNumber()== book.getIsbnNumber()){
                System.out.println("Matching book found");
                return true;
            }
        }
        return false;
    }

    public void setBooksTest(ArrayList<Bog> books){
        this.books = books;
    }

    public static void main(String[] args){
        Bibliotek bib = new Bibliotek();
        ArrayList<Bog> books = new ArrayList<>();
        books.add(new Bog(12345, "A Bogen", LocalDate.of(1999,9,9)));
        books.add(new Bog(54321, "B Bogen", LocalDate.of(2005,5,5)));
        books.add(new Bog(15243, "C Bogen", LocalDate.of(2010,10,10)));
        bib.setBooksTest(books);

        bib.checkBook(books.get(1));

    }
}
