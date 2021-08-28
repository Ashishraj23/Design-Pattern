package com.example.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }
    public List<Book> getBooks() {
        return books;
    }

    public BookShop setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public BookShop setBooks(List<Book> books) {
        this.books = books;
        return this;
    }
    public void loadData(){
        for (int i = 1; i <=10 ; i++) {
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book "+ i);
            getBooks().add(book);
        }
    }

    /**
     * default override clone method will give you sallow cloning
     * but we want here deep cloning other wise if we change something in first object then clone object also effect
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book book : getBooks()){
            bookShop.getBooks().add(book);
        }
        return  bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
