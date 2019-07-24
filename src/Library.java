
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Library {
    public static ArrayList<Book> listOfBooks = new ArrayList<>();
    public void addBook(Book book){
        listOfBooks.add(book);
    }
    
    public void updateBook(){
        String filePath = "D:/LibraryManagementSystem/book";
        
        try {
           FileReader fr = new FileReader(filePath);
           BufferedReader buffReader = new BufferedReader(fr);
           String firstLine = buffReader.readLine();
           
           fr.close();
           buffReader.close();
           
           BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
           writer.write(firstLine+"\n");
           
           for(int i=0;i<= Library.listOfBooks.size();i++) {
               writer.write(Library.listOfBooks.get(i).getBookInfor());
               break;
            }
           writer.flush();
           writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            //
        }
    }
}
