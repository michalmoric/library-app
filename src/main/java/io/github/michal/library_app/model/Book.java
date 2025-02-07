package io.github.michal.library_app.model;


import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String genre;

    private int yearNum;

    private String serialNum;

    private int inStockNum;

    

    public Book() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYearNum() {
        return yearNum;
    }
    public void setYearNum(int year) {
        this.yearNum = year;
    }
    public String getSerialNum() {
        return serialNum;
    }
    public void setSerialNum(String serialNo) {
        this.serialNum = serialNo;
    }
    public int getInStockNum() {
        return inStockNum;
    }
    public void setInStockNum(int inStockNo) {
        this.inStockNum = inStockNo;
    }

    

}
