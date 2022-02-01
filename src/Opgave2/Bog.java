package Opgave2;

import java.time.LocalDate;

public class Bog {
    private int isbnNumber;
    private String title;
    private LocalDate releaseDate;

    public Bog(int isbnNumber, String title, LocalDate releaseDate){
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }
    public String getTitle() {
        return title;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Titel: " + title + ", udgivet: " + releaseDate + ". ISBN-Nummer: " + isbnNumber;
    }
}
