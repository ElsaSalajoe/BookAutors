/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21_ooptest;


import java.util.Arrays;
import myclasses.Book;
import tools.Tools;


    public class App {
        public void run(){
            Tools tools = new Tools();
            Book[] books = new Book[5];
                for( int i = 0; i< 2; i++){
                    books[i] = tools.createBook();
            }
            System.out.println(Arrays.toString(books));
            for (int i = 0; i <2; i++){
                System.out.printf("Book(%n\t%s Authors=[%s]%n)", books[i].getTitle(), Arrays.toString(books[i].getAuthors()));
            }
            
            
        /*Scanner sc = new Scanner(System.in);
            Book book = tools.createBook("Mossflower");
            book.addAuthor(tools.createAuthor("Brian", "Jacques"));
            System.out.println(book.toString());*/    
            
        /*Book book2 = new Book();
            book2.setTitle("Learning JavaEE7");
            book2.addAuthor(createAuthor("Antonio","Gonsalves"));
            System.out.println(book2.toString());*/    
        }   
    }
