
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class User {
    public static ArrayList<User> listOfAccounts = new ArrayList<>();
    public  String username;
    public  String password;
    private static Librarian librarian;
    private static Student student ;
    private static Admin admin;
    public User(){
        username="a";
        password="b";
    }
    public User(String username,String password){
        this.username=username;
        this.password=password;
       
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
     
            this.password =password;
           
    }
    public String getStudentInfor(){
        String a="";
        String s="a";
       for(int i=0;i<= listOfAccounts.size()-1;i++) {
           if(User.listOfAccounts.get(i).getUserType().contains("Student")){
            s += ((Student)listOfAccounts.get(i)).getStudentID()+","+((Student)listOfAccounts.get(i)).getFirstName()+","+((Student)listOfAccounts.get(i)).getLastName()+","+((Student)listOfAccounts.get(i)).getUsername()+","+((Student)listOfAccounts.get(i)).getPassword()+","+((Student)listOfAccounts.get(i)).getDegree()+","+((Student)listOfAccounts.get(i)).getCourse()+"\n";
            a=s;
           }
        }
       return a;
    }
    public String getLibrarianInfor(){
        String a="";
        String s="a";
       for(int i=0;i<= listOfAccounts.size()-1;i++) {
           if(User.listOfAccounts.get(i).getUserType().contains("Librarian")){
            s += ((Librarian)listOfAccounts.get(i)).getStaffID()+","+((Librarian)listOfAccounts.get(i)).getFirstName()+","+((Librarian)listOfAccounts.get(i)).getLastName()+","+((Librarian)listOfAccounts.get(i)).getUsername()+","+((Librarian)listOfAccounts.get(i)).getPassword()+","+((Librarian)listOfAccounts.get(i)).getBookRecord()+"\n";
           a=s;
           }
        }
       return a;
    }
    public void addAdminAccount(Admin admin){
        listOfAccounts.add(admin);
    }
    public String getUserType(){
        return "User";
    }
    public void addStudentAccount(Student student){
        listOfAccounts.add(student);
    }
    public void addLibrarianAccount(Librarian librarian){
        listOfAccounts.add(librarian);
    }
}
