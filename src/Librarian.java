/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Librarian extends User{
    private final String staffID;
    private final String firstName;
    private final String lastName;
    private final String bookRecord;
    public Librarian(String staffID,String firstName,String lastName,String username,String password,String bookRecord){
        super(username,password);
        this.bookRecord=bookRecord;
        this.staffID=staffID;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getBookRecord(){
        return bookRecord;
    } 
    @Override
    public String getUserType(){
        return "Librarian";
    }
    public String getStaffID(){
        return staffID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
