
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class MainClass {
    private static Login login;
    public static void main(String[] args) throws FileNotFoundException, IOException{
        User user = new User();
        Library library = new Library();
        Admin admin = new Admin("admin1","admin1");
        user.addAdminAccount(admin);
        
        // Adding student accoutns to the system
	        String filePath = "D:/LibraryManagementSystem/studentAccounts";
	        File file = new File(filePath);
	        try{
	        BufferedReader buffReader = new BufferedReader(new FileReader(filePath));
	        
	        String firstLine = buffReader.readLine().trim();
	        
	        String[] dataRow = new String[20];
	        
	        Object[] tableLines = buffReader.lines().toArray();
	        for(int i=0 ; i<tableLines.length;i++){
	            String line = tableLines[i].toString().trim();
	            dataRow = line.split(",");
	           Student student = new Student(dataRow[0],dataRow[1],dataRow[2],dataRow[3],dataRow[4],dataRow[5],dataRow[6]);
	           user.addStudentAccount(student);
	        }
	        }catch (Exception ex){
	            //
	        }
       
        // Finishing adding
        
        // Adding librarian accounts to the system

	        String filePath2 = "D:/LibraryManagementSystem/librarianAccounts";
	        File file2 = new File(filePath2);
	        
	        BufferedReader buffReader2 = new BufferedReader(new FileReader(filePath2));
	        String firstLine2 = buffReader2.readLine().trim();
	        
	        
	        String[] dataRow2 = new String[20];
	        
	        Object[] tableLines2 = buffReader2.lines().toArray();
	        for(int i=0 ; i<tableLines2.length;i++){
	            String line = tableLines2[i].toString().trim();
	            dataRow2 = line.split(",");
	           Librarian librarian = new Librarian(dataRow2[0],dataRow2[1],dataRow2[2],dataRow2[3],dataRow2[4],dataRow2[5]);
	           user.addLibrarianAccount(librarian);
	        }
	        
        // Finish adding
        
        // Adding book
	        String filePath3 = "D:/LibraryManagementSystem/book";
	        File file3 = new File(filePath2);
	        
	        BufferedReader buffReader3 = new BufferedReader(new FileReader(filePath3));
	        String firstLine3 = buffReader3.readLine().trim();
	        
	        
	        String[] dataRow3 = new String[20];
	        
	        Object[] tableLines3 = buffReader3.lines().toArray();
	        for(int i=0 ; i<tableLines3.length;i++){
	            String line = tableLines3[i].toString().trim();
	            dataRow3 = line.split(",");
	           Book book = new Book(dataRow3[0],dataRow3[1],dataRow3[2],dataRow3[3],dataRow3[4]);
	           library.addBook(book);
	        }
	        for(int i=0; i<Library.listOfBooks.size();i++){
	            System.out.println(Library.listOfBooks.get(i).getBookInfor());
	            break;
	        }
        
        // Finishing adding book
        
        
        new Login().setVisible(true);
        
    }
}
