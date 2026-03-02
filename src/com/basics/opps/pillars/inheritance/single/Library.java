package com.basics.opps.pillars.inheritance.single;

public class Library {
    String name;
    int id;

    public Library(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class  Book extends Library{
    double price;
    Book(String name, int id, double price){
        super(name,id);
        this.price = price;
    }
   void bookDetails(){
       System.out.println(name + " " + id + " " + price);
   }

    public static void main(String[] args) {
        Book book = new Book("DD is GOD",12345,150);
        book.bookDetails();
    }
}