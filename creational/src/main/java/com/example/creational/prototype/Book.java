package com.example.creational.prototype;

public class Book {

    private long bid;
    private String bname;

    public long getBid() {
        return bid;
    }

    public Book setBid(long bid) {
        this.bid = bid;
        return this;
    }

    public String getBname() {
        return bname;
    }

    public Book setBname(String bname) {
        this.bname = bname;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }
}
