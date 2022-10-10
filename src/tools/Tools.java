/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;



/**
 * @author Elsa
 */
public class Tools {
    
    Scanner sc = new Scanner(System.in);
    
    public Author[] createAuthors(int countAuthorsInBook){
        Author[] authors = new Author[countAuthorsInBook];
        for (int i = 0; i < countAuthorsInBook; i++){
            System.out.println("Имя автора: " +(i+1)+": ");
            String firstname = sc.nextLine();
            System.out.println("Фамилия автора: "+(i+1)+": ");
            String lastname = sc.nextLine();
            Author author = new Author();
            author.setFirstname(firstname);
            author.setLastname(lastname);
            authors[i] = author;
        }
        return authors;
        }
        
        public Book createBook(){
            Book book = new Book();
            System.out.println("Название книги");
            book.setTitle(sc.nextLine());
            System.out.println("Сколько авторов в этой книге: ");
            int countAuthorsInBook = sc.nextInt();
            sc.nextLine();
            book.setAuthors(createAuthors(countAuthorsInBook));
            return book;
        }
        
        
}
