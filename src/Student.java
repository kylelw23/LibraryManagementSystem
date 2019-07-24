/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student extends User{
    private final String studentID;
    private final String firstName;
    private final String lastName;
    private final String degree;
    private final String course;
    public Student(String studentID,String firstName,String lastName,String username,String password,String degree,String course){
        super(username,password);
        this.degree=degree;
        this.course=course;
        this.studentID=studentID;
        this.firstName=firstName;
        this.lastName=lastName;
    }public String getStudentID(){
        return studentID;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getDegree(){
        return degree;
    }
    public String getCourse(){
        return course;
    }
    @Override
     public String getUserType(){
        return "Student";
    }
}
