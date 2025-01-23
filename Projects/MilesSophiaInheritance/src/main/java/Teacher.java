/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s.miles1313
 */
class Teacher extends Person {
    
    private String mySubject;
    private double mySalary;
    
//constructor
    public Teacher(String name, int age, String  gender, String subject, double salary){
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }
    
//Methods
    public String getSubject(){
        return mySubject;
    }
    
    public double getSalary(){
        return mySalary;
    }
    
    public void setSubject(String subject){
        mySubject = subject;
    }
    
    public void setSalary(double salary){
        mySalary = salary;
    }
    
//toString method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
    
}
