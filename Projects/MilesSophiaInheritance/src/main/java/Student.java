/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
class Student extends Person {

    private String myIdNum; // Student Id Number
    private double myGPA; // grade point average
    
// constructor
    public Student(String name, int age, String gender, String idNum, double gpa){
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
    
//Methods
    public String getIdNum(){
        return myIdNum;
    }
    
    public double getGPA(){
        return myGPA;
    }
    
    public void setIdNum(String id){
        myIdNum = id;
    }
    
    public void setGPA(double GPA){
        myGPA = GPA;
    }
    
//toString method
    @Override
    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }
}
