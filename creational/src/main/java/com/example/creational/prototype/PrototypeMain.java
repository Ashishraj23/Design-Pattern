package com.example.creational.prototype;

public class PrototypeMain {

    public static void main(String [] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Shop1");
        bookShop.loadData();

        System.out.println(bookShop);

//        BookShop bookShop1 = new BookShop();
//        bookShop1.setShopName("Shop2");
        /**
         * if we do  bookShop1.loadData(); again it will fetch data from DB that is costly,
         * here we want clone of first object which is already Book data
         */
//        bookShop1.loadData();

        BookShop bookShop1 = bookShop.clone();
        bookShop.getBooks().remove(2);
        bookShop1.setShopName("Shop2");
        System.out.println(bookShop1);
        System.out.println(bookShop);

    }
}
