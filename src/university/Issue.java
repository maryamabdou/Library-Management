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
public class Issue {
    public String callno;
    public String studentid;
    public String studentname;
    public String studentcontact;
    public String date;
    
    public Issue(String callno,String studentid,String studentname,String studentcontact,String date){
        this.callno=callno;
        this.studentid=studentid;
        this.studentname=studentname;
        this.studentcontact=studentcontact;
        this.date=date;
    }
}
    
