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
public class Student {
    public String name;
    public String password;
    public String email;
    public String address;
    public String city;
    public String contact;
    public int issued;
    
    public Student(String name,String password,String email,String address,String city,String contact,int issued){
        this.name=name;
        this.password=password;
        this.email=email;
        this.address=address;
        this.city=city;
        this.contact=contact;
        this.issued=issued;
   }
}
