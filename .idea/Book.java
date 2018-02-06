package sample;

import java.util.Scanner;

/**
 * Created by kor19 on 03.02.2018.
 */
public class Book extends Material {
    private String publisher;
    private int year;
    private int edition;
    private boolean is_bestseller;
    private int left_time;

    public int get_left_time() {
        return left_time;
    }

    public void set_left_time(int left_time) {
        this.left_time = left_time;
    }

    public boolean get_is_bestseller() {
        return is_bestseller;
    }

    public void set_is_bestseller(boolean is_bestseller) {
        this.is_bestseller = is_bestseller;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    Book() {
        //now entering in simple form
        //get information about user
        Scanner sc = new Scanner(System.in);
        setId();
        setTitle(sc.next());
        setAuthor(sc.next());
        setPublisher(sc.next());
        setEdition(sc.nextInt());
        setPrice(sc.nextInt());
        //доделать
        setKeyWords(sc.next());
        //после идёт owner,который ноль
        set_is_bestseller(sc.nextBoolean());
        set_left_time(sc.nextInt());
    }
}