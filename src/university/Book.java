/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author windows10
 */
public class Book {
    public String callno;
    public String name;
    public String author;
    public String publisher;
    public int quantity;
    public String date;
    public int issued;
    
    public Book(String callno,String name,String author,String publisher,int quantity,String date,int issued){
        this.callno=callno;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
        this.date=date;
        this.issued=issued;
   }


}