

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book {
    private  String title;
    private  String ISBN;
    private  String author;
    private  String location;
    private  String availability;
    public Book(){
        this.title=null;
        this.ISBN = null;
        this.author=null;
        this.location=null;
        this.availability=null;
    }
    public Book(String author,String title, String ISBN,String location,String availability){
        this.title=title;
        this.ISBN=ISBN;
        this.author=author;
        this.location=location;
        this.availability=availability;
    }
    public String getTitle(){
        return title;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getAuthor(){
        return author;
    }
    public String getLocation(){
        return location;
    }
    public String getAvailability(){
        return availability;
    }
    public String getBookInfor(){
       String s="";
        String a="";
        for(int i=0;i< Library.listOfBooks.size();i++) {
            s += (Library.listOfBooks.get(i)).getAuthor()+","+(Library.listOfBooks.get(i)).getTitle()+","+(Library.listOfBooks.get(i)).getISBN()+","+(Library.listOfBooks.get(i)).getLocation()+","+(Library.listOfBooks.get(i)).getAvailability()+"\n";
          a=s;
        }
       return a;
    }
    public void setAvailability(String avai){
        this.availability = avai;
    }
}
