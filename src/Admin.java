/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin extends User{
    private Librarian librarian;
    private Student student;
     public Admin(){
        username="a";
        password="b";
    }
    public Admin(String username,String password){
        super(username,password);
    }
    public void setLibrarianAccount(Librarian librarian){
        this.librarian =librarian;
    }
    @Override
     public String getUserType(){
        return "Admin";
    }
}
