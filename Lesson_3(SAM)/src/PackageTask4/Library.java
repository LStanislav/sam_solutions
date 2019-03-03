package PackageTask4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Library {
    String libName;
    String address;
    Book books[] = new Book[0];

    public void setLibName(String name){libName = name;}
    public void setAddress(String address){this.address=address;}
    public String getLibName(){return libName;}
    public String getAddress(){return address;}

    public Book[] getBooks() { return books; }
    public void pushBook(String name, String author, int year){
        Book newBook = new Book(name,author,year);
        books = Arrays.copyOf(books, books.length+1);
        books[books.length-1]=newBook;
    }
    public void showAuthors(){
        HashSet<String> mySet = new HashSet<String>();
        int kol=0;
        for (Book i:books){
            if (!mySet.contains(i.getAuthor())){
                System.out.println(i.getAuthor());
                mySet.add(i.getAuthor());
                kol++;
            }
        }
        System.out.println("Kol = " + kol);
    }

    public void showBooks(){
        for (Book i:books){
            System.out.println("Name = " + i.getBookName() + " Author = " + i.getAuthor());
        }
        System.out.println("Kol = " + books.length);
    }
    public void searchBook(int left, int right){
        if ((left>right) || (left<0) || (right<0)){
            System.out.println("Incorrect years!");
            return;
        }
        for (Book i:books){
            if ((i.getPublicationYear()>=left) && (i.getPublicationYear()<=right))
                System.out.println("Name = " + i.getBookName() + " Author = " + i.getAuthor());
        }
    }
}
