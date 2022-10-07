/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21_ooptest;


import java.util.Arrays;
import java.util.Scanner;
import myclasses.Book;
import tools.Tools;


    public class App {
        public void run(){
            /*Book book2 = new Book();
            book2.setTitle("Learning JavaEE7");
            book2.addAuthor(createAuthor("Antonio","Gonsalves"));
            System.out.println(book2.toString());*/
            Scanner sc = new Scanner(System.in);
            Tools tools = new Tools();
            Book book = tools.createBook("Mossflower");
            book.addAuthor(tools.createAuthor("Brian", "Jacques"));
            System.out.println(book.toString());
            Book[] books = new Book[5];
            for( int i = 0; i< 5; i++){
                System.out.println("Название книги");
                String title = sc.nextLine();
                book = new Book();
                book.setTitle(title);
                System.out.println("Сколько авторов в этой книге: ");
                int countAuthorsInBook = sc.nextInt();
                sc.nextLine();
                
                for (int j = 0; j < countAuthorsInBook; j++){
                    System.out.println("Имя автора: " +(j+1)+"");
                    String firstname = sc.nextLine();
                    System.out.println("Фамилия автора: ");
                    String lastname = sc.nextLine(); 
                    book.addAuthor(tools.createAuthor(firstname, lastname));
                }
                books[i] = book;
                
            }
            System.out.println(Arrays.toString(books));
        }
        
    }
