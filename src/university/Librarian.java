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
public class Librarian {
    public String name;
    public String password;
    public String email;
    public String address;
    public String city;
    public String contact;

   public Librarian(String name,String password,String email,String address,String city,String contact){
        this.name=name;
        this.password=password;
        this.email=email;
        this.address=address;
        this.city=city;
        this.contact=contact;
   }
}

//int flag=0;
//try{
//File f=new File("librarian.txt");
//ArrayList<Librarian> librarians=new ArrayList<>();
//Scanner s = new Scanner(f);
//
//
//while(s.hasNextLine()){
//String line=s.nextLine();
//String[] str=line.split(",");
// Librarian lib=new Librarian(str[0],str[1],str[2],str[3],str[4],str[5]);
//librarians.add(lib);
//}
//
//for(int i=0;i<librarians.size();i++){
//   if(librarians.get(i).name.compareTo(name)==0 && librarians.get(i).password.compareTo(password)==0){
//     flag=1;
//     new LibrarianSectionFrame().setVisible(true);
//     this.dispose();
//     break;
//    }  
//}
//   if(name.compareTo(test)==0 || password.compareTo(test)==0)
//      JOptionPane.showMessageDialog(null,"Error!");
//   
//    if(flag==0)
//   JOptionPane.showMessageDialog(null,"Error! Enter again");
//}
//  catch(Exception e){
//           JOptionPane.showMessageDialog(null,"Error!");
//        }
    